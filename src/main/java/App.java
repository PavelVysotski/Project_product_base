import database.DataBase;
import database.DataBaseService;
import entity.Product;
import menu.MenuAction;
import org.w3c.dom.ls.LSOutput;
import util.CommandReader;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

//        List<Product> list = DataBase.createBase();
//        DataBaseService.showBase(list);
//
//
//        DataBaseService.showBaseByCategory(list);

        MenuAction.worker();
    }
}
