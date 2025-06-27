import Orders.Order;
import Orders.IOrder;
public class SuperApp {
    public static void main(String[] args) throws Exception {
        IOrder order1 = new Order("Order testing");

        System.out.println(order1);
    }
}
