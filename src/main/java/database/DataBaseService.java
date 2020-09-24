package database;

import entity.Category;
import entity.Product;
import menu.MenuText;
import util.CommandReader;

import java.util.List;

public class DataBaseService {

    public static void deleteProduct(List<Product> productBase, long id) {

        productBase.remove((int) id - 1);
    }

    public static void addProduct(List<Product> productBase, Product product) {

        productBase.add(product);
    }

    public static void updateAnyProduct(List<Product> productBase, long id) {
        for (Product list : productBase) {
            if (list.getId() == id) {
                System.out.println(list);
                System.out.println("Какой параметр вы хотите изменить?");
            }
        }
    }

    public static void updateAllData() {

    }

    public static void showBase(List<Product> productBase) {
        for (Product list : productBase) {
            System.out.println(list);
        }
    }

    public static void showBaseByCategory(List<Product> productBase) {
        boolean categoryLoop = true;
        while (categoryLoop) {
            MenuText.menuCategoryChoice();
            int choice = CommandReader.readNumber("Сделайте свой выбор: ");
            switch (choice) {
                case 1:
                    Enum fruits = Category.ОВОЩИ;
                    for (Product list : productBase) {
                        if (list.getCategory().equals(fruits)) {
                            System.out.println(list);
                        }
                    }
                    break;
                case 2:
                    Enum vegetables = Category.ФРУКТЫ;
                    for (Product list : productBase) {
                        if (list.getCategory().equals(vegetables)) {
                            System.out.println(list);
                        }
                    }
                    break;
                case 3:
                    Enum berries = Category.ЯГОДЫ;
                    for (Product list : productBase) {
                        if (list.getCategory().equals(berries)) {
                            System.out.println(list);
                        }
                    }
                    break;
                case 4:
                    categoryLoop = false;
                    break;
                default:
                    System.out.println("Такого варианта выбора нет, повторите его: ");
            }
        }
    }
}



