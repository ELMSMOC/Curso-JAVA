package Products;

import enums.Category;

public class Hygiene extends Product{

    public Hygiene(String ref, int vol, int weight) {
        super(ref, vol, weight);

    }

    @Override
    public Category getCategory() {
        return Category.HYGIENE;
    }

    @Override
    public boolean isCompatible(IProduct product) {
        return product.getCategory() == Category.PETS || product.getCategory() == Category.HYGIENE;
    } 
}
