package Containers;

import Products.IProduct;

public class Box extends Container{

    private int width;
    private int height;
    private int length;

    public Box(int resistance, int volumen, int size) {
        super(resistance, volumen, size);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int getResistance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResistance'");
    }

    @Override
    public int calcVolumen() {
        return width * length;
    }

    @Override
    public int calcSurface() {
       return width * length * height;
    }

    @Override
    public boolean isResistent(IProduct product) {
        return false;
    }

}
