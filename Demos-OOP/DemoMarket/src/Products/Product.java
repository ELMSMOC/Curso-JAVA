package Products;

import java.util.Locale.Category;

import Containers.IContainer;

public class Product implements IProduct {
    String ref;
    private int prize;
    private int vol;
    private int size;
    private int count;
    private int weight;
    private Category category;


    @Override
    public String getRef() {
        return ref;
    }

    public int getPrize(Object obj){
        return prize;
    };

    public int getSize(Object obj){
        return size;
    };

    public int getCount(Object obj){
        return count;
    };

    public Product(int prize, int vol){
        this.prize = prize;
        this.vol = vol;
    }


    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getVol() {
        return vol;
    }

    @Override
    public String getCategory() {
        return category.toString();
    }

    @Override
    public boolean isCompatible(IProduct i) {
        // TODO
        return false;
    }

    @Override
    public boolean hasSpace(IContainer container) {
    //    TODO
        return false;
    }
    @Override
    public void putInto(IContainer container) {
        
    }


}
