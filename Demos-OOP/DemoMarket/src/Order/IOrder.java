package Order;

import java.util.Set;

import Containers.IContainer;
import Products.IProduct;

public interface IOrder {
    String getRef ();

    Set<IOrder> getProducts();

    Set<IContainer> getContainers();
    void addContainer(IContainer container);
    IContainer addProduct(IProduct product);
}
