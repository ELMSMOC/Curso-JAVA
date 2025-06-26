package Products;

import java.util.Locale.Category;

import Containers.IContainer;

public class Product implements IProduct {
    String ref;
    private int prize;
    private int vol;
    private int size;
    private int weight;
    private Category category;
    private int count;


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

    public Product(String ref, int prize, int vol, int weight, int size, Category category){
        this.prize = prize;
        this.vol = vol;
        this.ref = ref;
        this.weight = weight;
        this.size = size;
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
