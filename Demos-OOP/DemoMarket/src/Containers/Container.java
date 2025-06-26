package Containers;

import java.util.Set;

import Products.IProduct;

public class Container implements IContainer{

    private int weigthAvailable;
    private int volumen;
    private int size;

    public Container(int weigthAvailable, int volumen, int size){
        this.weigthAvailable = weigthAvailable;
        this.volumen = volumen;
        this.size = size;
    }

    @Override
    public String getRef() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRef'");
    }

    @Override
    public int getVol() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVol'");
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
