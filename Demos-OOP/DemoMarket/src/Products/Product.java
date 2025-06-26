package Products;

public class Product implements IProduct {
    private int prize;
    private int vol;

    public static void getPrize(Object obj){
    };

    public static void getSize(Object obj){
    };

    public static void getCount(Object obj){
    };

    public Product(int prize, int vol){
        this.prize = prize;
        this.vol = vol;
    }

    @Override
    public String getRef() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRef'");
    }

    @Override
    public int getWeight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWeight'");
    }

    @Override
    public int getVol() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVol'");
    }

    @Override
    public String getCategory() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCategory'");
    }

    @Override
    public boolean isCompatible() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isCompatible'");
    }

    @Override
    public void addProduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addProduct'");
    }

}
