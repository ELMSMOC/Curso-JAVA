package Order;

import java.util.Set;

import Containers.IContainer;
import Products.IProduct;

public interface IOrder {
    
    // Getters
    String getRef ();
    Set<IContainer> getContainers();
    Set<IProduct> getProducts();

    // Logica
    void addContainer(IContainer container);
    IContainer addProduct(IProduct product);
}
