package Products;

import enums.Category;

public class Food extends Product{

    public Food(String ref, int vol, int weight) {
        super(ref, vol, weight);

    }

    @Override
    public Category getCategory() {
        return Category.FOOD;
    }

    @Override
    public boolean isCompatible(IProduct product) {
        return product.getCategory() == Category.FOOD;
    } 
}
