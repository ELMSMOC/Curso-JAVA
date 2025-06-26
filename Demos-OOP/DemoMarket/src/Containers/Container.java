package Containers;

import java.util.Set;

import Products.IProduct;
import enums.ContainerType;

public class Container implements IContainer{

    private String ref;
    private int weigthAvailable;
    private int volumen;
    private int surface;
    private ContainerType type; 

    public Container(int weigthAvailable, int volumen, int size){
        this.weigthAvailable = weigthAvailable;
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
        return 
    }

    @Override
    public int getVol() {
        return volumen;
    }

    @Override
    public int volAvailable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'volAvailable'");
    }

    @Override
    public int getResistance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResistance'");
    }


    @Override
    public Set<IProduct> getProducts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProducts'");
    }

    @Override
    public String getTyppe() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTyppe'");
    }

    // LOGICA
    @Override
    public boolean addProduct(IProduct product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addProduct'");
    }

    @Override
    public boolean isResistent(IProduct product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isResistent'");
    }

   

  

}
