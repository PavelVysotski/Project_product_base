package menu;

import database.DataBase;
import database.DataBaseService;
import entity.Category;
import entity.Product;
import entity.ProductService;
import util.CommandReader;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

public class MainMenuAction {

    public static void worker() {
        boolean mainLoop = true;
        List<Product> productBase = DataBase.createBase();
        while (mainLoop) {
            MenuText.mainMenu();
            int menuChoice = CommandReader.readNumber("Сделайте свой выбор: ");
            switch (menuChoice) {
                case 1:
                    DataBaseService.showBase(productBase);
                    break;
                case 2:
                    DataBaseService.showBaseByCategory(productBase);
                    break;
                case 3:
                    try {
                        DataBaseService.addProduct(productBase, ProductService.createNewProduct(productBase));
                        DataBaseService.showBase(productBase);
                    } catch (IllegalArgumentException e) {
                        System.out.println("----------------");
                        System.err.println("Введенная категория не существует, повторите процедуру снова: ");
                    }
                    break;
                case 4:
                    MenuChoiceAction.choiceAction(productBase);
                    break;
                case 5:
                    mainLoop = false;
                    System.out.println("Спасибо, что пользовались нашими услугами ))))");
                    break;
                default:
                    System.out.println("Такого варианта выбора нет, повторите его: ");
            }
        }
    }

}
