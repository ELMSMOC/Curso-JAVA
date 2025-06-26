package Containers;

import java.util.Set;
import Products.IProduct;
import enums.ContainerType;

public interface IContainer {

    // Getters
    String getReference();
    
    int getVol();
    
    int volAvailable();
    
    int getResistance();
    // Setters
    ContainerType getType();
    
    Set<IProduct> getProducts();

    // Logica
    
    String getTyppe();

    boolean addProduct (IProduct product);

    boolean isResistent(IProduct product); 
}
