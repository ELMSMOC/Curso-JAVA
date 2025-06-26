package Products;

public interface IProduct {
    String getRef();
    int getWeight();
    int getVol();
    String getCategory();
    
    boolean isCompatible();
    void addProduct();
}
