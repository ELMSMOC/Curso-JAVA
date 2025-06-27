package Orders;

import java.util.HashSet;
import java.util.Set;

import Containers.IContainer;
import Products.IProduct;

public class Order implements IOrder{

    private String ref;
    private Set<IContainer> containers;

    public Order(String ref){
        this.ref = ref;
    } 

    @Override
    public String getRef() {
        return ref;
    }

    @Override
    public Set<IProduct> getCalculatedProducts() {
        Set<IProduct> products = new HashSet<>();

        for (IContainer container : containers) {
            products.addAll(container);
        }

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
