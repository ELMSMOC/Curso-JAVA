package Containers;

import java.util.Random;

import Products.IProduct;
import enums.ContainerType;

public class Bag extends Container {

    private int length;

    public Bag(String ref, int resistance, int length, int height) {
        super(ref);
        this.resistance = resistance;
        this.length = length;
        this.height = height;
    }

    @Override
    public ContainerType getType() {
        return ContainerType.BAG;
    }

    @Override
    public int calcSurface() {
       int radio = calcDiameter() / 2;
        return (int) (Math.PI * radio * radio);
    }

    public int calcDiameter(){
        return (int) ((2 * length)/Math.PI);
    }

    @Override
    public boolean isResistent(IProduct product) {
        return true;
    }


}
