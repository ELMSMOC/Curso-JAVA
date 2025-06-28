package Containers;
import java.util.Set;
import enums.ContainerType;

import Products.IProduct;

public abstract class Container implements IContainer{

    private String ref;
    private int resistance;
    private int height;


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
        // TODO
        return false;
    }

    @Override
    public int volumenDisposable(){
        // TODO
        return 0;
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
