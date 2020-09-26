package menu;

import database.DataBase;
import database.DataBaseService;
import entity.Category;
import entity.Product;
import util.CommandReader;

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
                    MenuChoiceAction.choiceAction(productBase);
                    break;
                case 4:
                    mainLoop = false;
                    break;
                default:
                    System.out.println("Такого варианта выбора нет, повторите его: ");
            }
        }
    }

}
