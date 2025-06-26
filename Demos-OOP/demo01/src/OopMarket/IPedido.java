package OopMarket;

public interface IPedido {
    String getRef ();

    Set<IPedido> getProducts();

    Set<IContainer> getContainers();
    void addContainer(IContainer container);
    IContenedor addProduct(IProduct product);
}
