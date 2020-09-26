package menu;

import database.DataBaseService;
import entity.Product;
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
                    DataBaseService.showBase(productBase);
                    DataBaseService.updateFromId(productBase);
                    DataBaseService.showBase(productBase);
                    break;
                case 2:
                    DataBaseService.showBase(productBase);
                    DataBaseService.updateAnyProduct(productBase);
                    break;
                case 3:
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
