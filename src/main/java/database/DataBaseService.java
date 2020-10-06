package database;

import entity.Category;
import entity.Product;
import io.DataReader;
import io.DataWriter;
import io.IOConstants;
import menu.MenuText;
import util.CommandReader;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class DataBaseService {


    public static void writeObjectsToFile() {

        List<Product> productBase = DataBase.createBase();

        DataWriter dataWriter = new DataWriter(IOConstants.FILENAME);
        try {
            dataWriter.writeToFile(productBase);
            System.out.println("Данные записаны в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readObjectsToFile() {
        DataReader dataReader = new DataReader(IOConstants.FILENAME);
        try {
            List<Product> productBase = dataReader.readFromFile();
            for (Product product : productBase){
                System.out.println(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteProduct(List<Product> productBase) {
        System.out.println("---------------------");
        int id = CommandReader.readNumber("Введите номер продукта: ");
        Iterator<Product> productIterator = productBase.iterator();
        while (productIterator.hasNext()) {
            Product nextProduct = productIterator.next();
            if (nextProduct.getId() == id) {
                productIterator.remove();
            }
        }
    }

    public static void addProduct(List<Product> productBase, Product product) {
        productBase.add(product);
    }

    public static void updateAnyProduct(List<Product> productBase) {
        System.out.println("---------------------");
        int id = CommandReader.readNumber("Введите номер продукта: ");
        boolean updateLoop = true;
        for (Product product : productBase) {
            if (product.getId() == id) {
                System.out.println(product);
                while (updateLoop) {
                    MenuText.menuAnyDataChange();
                    int choice = CommandReader.readNumber("Ваш выбор: ");
                    switch (choice) {
                        case 1:
                            String categoryChoice = CommandReader.readString("Введите одну из категорий 'ФРУКТЫ, ОВОЩИ, ЯГОДЫ': ");
                            categoryChoice = categoryChoice.toUpperCase();
                            Category category = Category.valueOf(categoryChoice);
                            product.setCategory(category);
                            break;
                        case 2:
                            String newName = CommandReader.readString("Введите новое название: ");
                            product.setName(newName);
                            System.out.println(product);
                            break;
                        case 3:
                            double newPrice = CommandReader.readDouble("Введите новую цену: ");
                            product.setPrice(BigDecimal.valueOf(newPrice));
                            System.out.println(product);
                            break;
                        case 4:
                            double newDiscount = CommandReader.readDouble("Введите новую скидку: ");
                            product.setDiscount(BigDecimal.valueOf(newDiscount));
                            System.out.println(product);
                            break;
                        case 5:
                            String newDescription = CommandReader.readString("Введите новое описание: ");
                            product.setDescription(newDescription);
                            System.out.println(product);
                            break;
                        case 6:
                            updateLoop = false;
                            break;
                        default:
                            System.out.println("Такого варианта выбора нет, повторите его: ");
                    }
                }
            }
        }
    }

    public static void updateFromId(List<Product> productBase) {
        System.out.println("---------------------");
        int id = CommandReader.readNumber("Введите номер продукта: ");
        for (Product product : productBase) {
            if (product.getId() == id) {
                String categoryChoice = CommandReader.readString("Введите одну из категорий 'ФРУКТЫ, ОВОЩИ, ЯГОДЫ': ");
                categoryChoice = categoryChoice.toUpperCase();
                Category category = Category.valueOf(categoryChoice);
                product.setCategory(category);
                String newName = CommandReader.readString("Введите новое название: ");
                product.setName(newName);
                double newPrice = CommandReader.readDouble("Введите новую цену: ");
                product.setPrice(BigDecimal.valueOf(newPrice));
                double newDiscount = CommandReader.readDouble("Введите новую скидку: ");
                product.setDiscount(BigDecimal.valueOf(newDiscount));
                String newDescription = CommandReader.readString("Введите новое описание: ");
                product.setDescription(newDescription);
            }
        }
        System.out.println("Изменения успешно внесены и сохранены.");
    }

    public static void showBase(List<Product> productBase) {
        System.out.println("---------------------");
        for (Product list : productBase) {
            System.out.println(list);
        }
        System.out.println("---------------------");
    }

    public static void showBaseByCategory(List<Product> productBase) {
        System.out.println("---------------------");
        boolean categoryLoop = true;
        while (categoryLoop) {
            MenuText.menuCategoryChoice();
            int choice = CommandReader.readNumber("Сделайте свой выбор: ");
            switch (choice) {
                case 1:
                    System.out.println("---------------------");
                    Category fruits = Category.ОВОЩИ;
                    for (Product list : productBase) {
                        if (list.getCategory().equals(fruits)) {
                            System.out.println(list);
                        }
                    }
                    System.out.println("---------------------");
                    break;
                case 2:
                    System.out.println("---------------------");
                    Category vegetables = Category.ФРУКТЫ;
                    for (Product list : productBase) {
                        if (list.getCategory().equals(vegetables)) {
                            System.out.println(list);
                        }
                    }
                    System.out.println("---------------------");
                    break;
                case 3:
                    System.out.println("---------------------");
                    Category berries = Category.ЯГОДЫ;
                    for (Product list : productBase) {
                        if (list.getCategory().equals(berries)) {
                            System.out.println(list);
                        }
                    }
                    System.out.println("---------------------");
                    break;
                case 4:
                    categoryLoop = false;
                    break;
                default:
                    System.out.println("Такого варианта выбора нет, повторите его: ");
            }
        }
        System.out.println("---------------------");
    }
}



