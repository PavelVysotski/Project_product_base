package menu;

import database.DataBaseService;
import entity.Product;
import entity.ProductService;
import util.CommandReader;

import java.util.List;

public class MenuChoiceAction {

    public static void choiceAction(List<Product> productBase) {
        boolean choiceLoop = true;
        while (choiceLoop) {
            MenuText.menuChangeChoice();
            int choice = CommandReader.readNumber("Сделайте ваш выбор: ");
            switch (choice) {
                case 1:
                    try {
                        DataBaseService.showBase(productBase);
                        DataBaseService.updateFromId(productBase);
                        DataBaseService.showBase(productBase);
                    } catch (IllegalArgumentException e) {
                        System.out.println("----------------");
                        System.err.println("Не верно введены данные, повторите процедуру снова: ");
                    }
                    break;
                case 2:
                    try {
                        DataBaseService.showBase(productBase);
                        DataBaseService.updateAnyProduct(productBase);
                    } catch (IllegalArgumentException e) {
                        System.out.println("----------------");
                        System.err.println("Не верно введены данные, повторите процедуру снова: ");
                    }
                    break;
                case 3:
                    DataBaseService.showBase(productBase);
                    DataBaseService.deleteProduct(productBase);
                    DataBaseService.showBase(productBase);
                    break;
                case 4:
                    choiceLoop = false;
                    break;
                default:
                    System.out.println("Такого варианта выбора нет, повторите его: ");
            }
        }
    }
}
