package menu;

public class MenuText {

    public static void mainMenu (){
        System.out.println("Вы зашли в базу продуктов.");
        System.out.println("1. Показать весь список продуктов.");
        System.out.println("2. Вывести список по типу продукта.");
        System.out.println("3. Внести изменение в список продуктов.");
        System.out.println("4. Выход из базы.");
        System.out.println("Сделайте ваш выбор: ");

    }

    public static void menuCategoryChoice (){
        System.out.println("");
    }

    public static void menuChangeChoice (){
        System.out.println("1. Полностью измененить выбранный продукт.");
        System.out.println("2. Частичное изменение выбранного продукта.");
        System.out.println("3. Удалить продукт из списка по выбору id.");
        System.out.println("4. Выход в главное меню.");
    }

    public static void menuAnyDataChange (){
        System.out.println("Какой параметр вы хотите изменить?");
        System.out.println("1. Тип продукта.");
        System.out.println("2. Наименование продукта.");
        System.out.println("3. Цену продукта.");
        System.out.println("4. Скидку продукта.");
        System.out.println("5. Описание продукта.");
    }
}
