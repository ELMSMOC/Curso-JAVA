package Containers;

import java.util.Set;
import Products.IProduct;
import enums.ContainerType;

public interface IContainer {

    // Getters
    String getReference();
    
    ContainerType getType();
    // int getResistance();

    // Devuelve un set tipo interfaz Iproduct
    Set<IProduct> getProducts();

    // Propiedades calculadas
    
    int calcSurface();
    int calcVolumen();

    // Logica
    
    int volumenDisposable();

    boolean canInsert (IProduct product);

    boolean isResistent(IProduct product); 
}
