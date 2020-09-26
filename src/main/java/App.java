import database.DataBase;
import database.DataBaseService;
import entity.Category;
import entity.Product;
import entity.ProductService;
import menu.MainMenuAction;
import org.apache.log4j.chainsaw.Main;

import java.util.List;

public class App {
    public static void main(String[] args) {

        MainMenuAction.worker();
    }
}
