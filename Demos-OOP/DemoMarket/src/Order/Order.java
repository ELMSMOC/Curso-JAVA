package Order;

import java.util.Set;

import Containers.IContainer;
import Products.IProduct;

public class Order implements IOrder{

    @Override
    public String getRef() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRef'");
    }

    @Override
    public Set<IOrder> getProducts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProducts'");
    }

    @Override
    public Set<IContainer> getContainers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getContainers'");
    }

    @Override
    public void addContainer(IContainer container) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addContainer'");
    }

    @Override
    public IContainer addProduct(IProduct product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addProduct'");
    }

}
