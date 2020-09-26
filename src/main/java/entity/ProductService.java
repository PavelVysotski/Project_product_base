package entity;

import util.CommandReader;

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

    public static Product createNewProduct(List<Product> productBase) {
        long id;
        if (productBase.size() == 0) {
            id = 1;
        } else {
            id = productBase.get(productBase.size() - 1).getId() + 1;
        }
        String categoryChoice = CommandReader.readString("Введите одну из категорий 'ФРУКТЫ, ОВОЩИ, ЯГОДЫ': ");
        categoryChoice = categoryChoice.toUpperCase();
        Category category = Category.valueOf(categoryChoice);
        String name = CommandReader.readString("Введите наименование продукта: ");
        double price = CommandReader.readDouble("Введите цену продукта: ");
        double discount = CommandReader.readDouble("Введите скидку продукта: ");
        String description = CommandReader.readString("Введите описание продукта: ");

        return new Product(id, category, name, price, discount, description);
    }
}
