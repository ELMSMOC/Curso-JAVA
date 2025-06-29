package Products;

import Containers.IContainer;
import enums.Category;

public class Drugstore extends Product {

    public Drugstore(String ref, int vol, int weight) {
        super(ref, vol, weight);
    }

    @Override
    public Category getCategory() {
        return Category.DRUGSTORE;
    }

}
