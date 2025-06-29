package Products;

import enums.Category;

public class Pets extends Product{

    public Pets(String ref, int vol, int weight) {
        super(ref, vol, weight);
    }

    @Override
    public enums.Category getCategory() {
        return Category.PETS;
    }
}
