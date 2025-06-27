package Orders;

import java.util.Set;

import Containers.IContainer;
import Products.IProduct;

public interface IOrder {
    
    // Getters
    String getRef ();
    Set<IContainer> getContainers();
    
    // Logica
    Set<IProduct> getCalculatedProducts();
    
    void addContainer(IContainer container);
    IContainer addProduct(IProduct product);
}
