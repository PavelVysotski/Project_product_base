import database.DataBaseService;
import menu.MainMenuAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        DataBaseService.writeObjectsToFile();
        DataBaseService.readObjectsToFile();

//        MainMenuAction.worker();
    }
}
