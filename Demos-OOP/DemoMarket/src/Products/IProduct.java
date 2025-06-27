package Products;

import java.util.Locale.Category;

import Containers.IContainer;
import enums.Category;

public interface IProduct {
    String getRef();
    int getWeight();
    int getVol();
    Category getCategory();
    
    boolean isCompatible(IProduct i);
    boolean hasSpace(IContainer container);
    void putInto(IContainer containeri);
}
