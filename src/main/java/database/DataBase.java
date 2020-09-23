package database;

import entity.Category;
import entity.Product;
import entity.ProductService;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<Product> createBase() {
        List<Product> productBase = new ArrayList<>();
        DataBaseService.addProduct(productBase, ProductService.createProduct(productBase, Category.ФРУКТЫ, "Апельсин", 5.59, 0.05, "Морокко"));
        DataBaseService.addProduct(productBase, ProductService.createProduct(productBase, Category.ФРУКТЫ, "Авокадо", 10.34, 0.07, "Испания"));
        DataBaseService.addProduct(productBase, ProductService.createProduct(productBase, Category.ОВОЩИ, "Картофель", 2.15, 0.07, "Беларусь"));
        DataBaseService.addProduct(productBase, ProductService.createProduct(productBase, Category.ЯГОДЫ, "Малина", 4.19, 0.05, "Беларусь"));
        DataBaseService.addProduct(productBase, ProductService.createProduct(productBase, Category.ОВОЩИ, "Томат", 3.15, 0.03, "Нидерланды"));
        DataBaseService.addProduct(productBase, ProductService.createProduct(productBase, Category.ЯГОДЫ, "Клюква", 11.49, 0.07, "Беларусь"));
        return productBase;
    }
}
