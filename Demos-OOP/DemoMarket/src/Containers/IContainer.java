package Containers;

import java.util.Set;

public interface IContainer {
    String getRef();
    
    int getVol();
    
    int volAvailable();
    
    int getResistance();
    
    Set<IProduct> getProducts();
    
    String getTyppe();

    boolean addProduct (IProduct product);

    boolean isResistent(IProduct product); 
}
