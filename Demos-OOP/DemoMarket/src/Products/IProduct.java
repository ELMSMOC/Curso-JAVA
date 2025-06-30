package Products;

import enums.Category;

import Containers.IContainer;

public interface IProduct {
    String getRef();
    int getWeight();
    int getVol();
    Category getCategory();
    
    boolean isCompatible(IProduct product);
    boolean hasSpace(IContainer container);
    void putInto(IContainer containeri);
}
