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
        this.containers = new HashSet<>();
    } 

    @Override
    public String getRef() {
        return ref;
    }

    @Override
    public Set<IContainer> getContainers() {
        return containers;
    }

    @Override
    public Set<IProduct> getCalculatedProducts() {
        Set<IProduct> products = new HashSet<>();

        for (IContainer container : containers) {
            products.addAll(container.getProducts());
        }

       return products;
    }

    @Override
    public void addContainer(IContainer container) {
        containers.add(container); // Nos ahorramos el this
    }

    @Override
    public IContainer addProduct(IProduct product) {
        for (IContainer container : containers) {
            if (container.canInsert(product))
            return container;
        }
        return null;
        // TODO
    }

    @Override
    public String toString() {
         String message = """
                 Pedido: %s
                 Hash: %s
                 """.formatted(ref,
                 super.toString()
                 );  
                 
        for (IContainer container : containers) {
            message += container;
        }

        return message;
    }

}
