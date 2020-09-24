package entity;

import java.util.List;

public class ProductService {

    public static Product createProduct(List<Product> productBase, Category category, String name, double price, double discount, String description) {
        long id;
        if (productBase.size() == 0) {
            id = 1;
        } else {
            id = productBase.get(productBase.size() - 1).getId() + 1;
        }
        return new Product(id, category, name, price, discount, description);
    }
}
