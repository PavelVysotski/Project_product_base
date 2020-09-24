import database.DataBase;
import database.DataBaseService;
import entity.Product;
import org.w3c.dom.ls.LSOutput;
import util.CommandReader;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Product> list = DataBase.createBase();
        DataBaseService.showBase(list);

        System.out.println("1. ФРУКТЫ.");
        System.out.println("2. ОВОЩИ.");
        System.out.println("3. ЯГОДЫ.");
        int category  = CommandReader.readNumber("Введите категорию.");
        DataBaseService.showBaseByCategory(list, category);
    }
}
