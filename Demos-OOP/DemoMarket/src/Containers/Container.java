package Containers;
import java.util.Set;


import Products.IProduct;

public abstract class Container implements IContainer{

    private String ref;
    protected int resistance;
    protected int height;


    private Set<IProduct> products;

    public Container(String ref){
        this.ref = ref;
    }

    // Getters
    @Override
    public String getReference() {
       return ref;
    }
    
    @Override
    public Set<IProduct> getProducts() {
        return products;
    }

    @Override
    public int calcVolumen() {
        return calcSurface() * height;
    }

    // LOGICA
    @Override
    public boolean canInsert(IProduct product) {
        // Es resistente?
        if (!this.isResistent(product)){
            return false;
        }
        // Tiene espacio el container (this) para product?
        if (!product.hasSpace(this)){
            return false;
        }

        // Son compatibles?
        for (IProduct item : products) {
        // if (item.isCompatible(product)) Seria igual
          if(!product.isCompatible(item)){
            return false;
          }
        }
        
        return true;
    }

    @Override
    public boolean isResistent(IProduct product) {
        return true;
    }

    @Override
    public int volumenAvailable(){
        int totalVol =  calcVolumen();
        int usedVol = 0;

        for (IProduct product : products) {
            usedVol += product.getVol();
        }

        return totalVol - usedVol;
    }

    @Override
    public String toString() {
         String message = """
                 %s ref. %s
                 Hash: %s
                 """.formatted(
                    getType(),
                    ref,
                    super.toString()
                 );   

        return message;
    }

   

  

}
