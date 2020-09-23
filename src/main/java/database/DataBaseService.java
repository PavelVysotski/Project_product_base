package database;

import entity.Product;

import java.util.List;

public class DataBaseService {

    public static void deleteProduct(List<Product> productBase, long id) {

        productBase.remove((int) id - 1);
    }

    public static void addProduct(List<Product> productBase, Product product) {

        productBase.add(product);
    }

    public static void showBase(List<Product> productBase) {
        for (Product list : productBase) {
            System.out.println(list);
        }
    }
}
