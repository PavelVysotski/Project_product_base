import database.DataBase;
import database.DataBaseService;

public class App {
    public static void main(String[] args) {


        DataBaseService.showBase(DataBase.createBase());
    }
}
