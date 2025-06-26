package Containers;

import java.util.Set;

import Products.IProduct;
import enums.ContainerType;

public abstract class Container implements IContainer{

    private String ref;
    private ContainerType type; 
    private int resistance;
    private int surface;
    private int volumen;
    private Set<IProduct> products;

    public Container(int resistance, int volumen, int size){
        this.resistance = resistance;
        this.volumen = volumen;
        this.surface = size;
    }

    // Getters
    @Override
    public String getReference() {
       return ref;
    }

    @Override
    public ContainerType getType() {
        return type;
    }

    @Override
    public int getVol() {
        return volumen;
    }

    @Override
    public int getResistance() {
        return resistance;
    }


    @Override
    public Set<IProduct> getProducts() {
        return products;
    }

    
    @Override
    public int getSurface() {
        return surface;
    }

    // LOGICA
    @Override
    public boolean canInsert(IProduct product) {
        return false;
    }

    @Override
    public boolean isResistent(IProduct product) {
        return false;
    }

    @Override
    public int volumenDisposable(){
        return 0;
    }

   

  

}
