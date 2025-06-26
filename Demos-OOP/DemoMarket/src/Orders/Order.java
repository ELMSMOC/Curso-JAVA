package Orders;

import java.util.Set;

import Containers.IContainer;
import Products.IProduct;

public class Order implements IOrder{

    private String ref;
    private Set<IContainer> containers;
    private Set<IProduct> products;

    public Order(String ref){
        this.ref = ref;
    } 

    @Override
    public String getRef() {
        return ref;
    }

    @Override
    public Set<IProduct> getProducts() {
       return products;
    }

    @Override
    public Set<IContainer> getContainers() {
        return containers;
    }

    @Override
    public void addContainer(IContainer container) {
        containers.add(container); // Nos ahorramos el this
    }

    @Override
    public IContainer addProduct(IProduct product) {
        products.add(product);
        return  null;
        // TODO
    }

}
