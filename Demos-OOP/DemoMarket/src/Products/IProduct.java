package Products;

import java.util.Locale.Category;

import Containers.IContainer;

public interface IProduct {
    String getRef();
    int getWeight();
    int getVol();
    String getCategory();
    
    boolean isCompatible(IProduct i);
    boolean hasSpace(IContainer container);
    void putInto(IContainer containeri);
}
