package Products;

import enums.Category;

import Containers.IContainer;

public abstract class Product implements IProduct {
    // private int prize;
    // private int size;
    private Category category;
    private String ref;
    private int weight;
    private int vol;

    public Product(String ref, int vol, int weight){
        this.vol = vol;
        this.ref = ref;
        this.weight = weight;
    }

    @Override
    public String getRef() {
        return ref;
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
    public void putInto(IContainer container) {
        container.getProducts().add(this);
    }

    @Override
    public boolean hasSpace(IContainer container) {
        return vol <= container.volumenAvailable();
    }

    @Override
    public String toString() {
        String message = "[%s] %s %s cm3 - %s g".formatted(
         getCategory().toString().toUpperCase(), ref,    
        vol, weight);
        return message;
    }

}
