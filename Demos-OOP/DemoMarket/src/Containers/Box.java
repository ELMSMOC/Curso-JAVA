package Containers;

import Products.IProduct;
import enums.ContainerType;

public class Box extends Container{

    private int width;
    private int length;

    public Box(String ref, int width, int length, int height) {
        super(ref);
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public ContainerType getType() {
        return ContainerType.BOX;
    }

    @Override
    public int calcSurface() {
       return width * length;
    }

    @Override
    public boolean isResistent(IProduct product) {
        return false;
    }


}
