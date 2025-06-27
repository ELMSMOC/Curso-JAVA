package Containers;

import java.util.Set;

import Products.IProduct;

public abstract class Container implements IContainer{

    private String ref;
    private int resistance;


    private Set<IProduct> products;

    public Container(int resistance, int volumen, int size){
        this.resistance = resistance;
    }

    // Getters
    @Override
    public String getReference() {
       return ref;
    }

    // @Override
    // public ContainerType getType() {
    //     return type;
    // }

    // @Override
    // public int getResistance() {
    //     return resistance;
    // }

    // @Override
    // public int calcVolumen() {
    //     return width * height * length;
    // }

    @Override
    public Set<IProduct> getProducts() {
        return products;
    }

    
    // @Override
    // public int getSurface() {
    //     return 0;
    // }

    // LOGICA
    @Override
    public boolean canInsert(IProduct product) {
        return false;
    }

    @Override
    public int volumenDisposable(){
        return 0;
    }

   

  

}
