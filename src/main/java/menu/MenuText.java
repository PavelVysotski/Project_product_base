package menu;

public class MenuText {

    public static void mainMenu() {
        System.out.println("Главное меню базы продуктов:");
        System.out.println("1. Показать весь список продуктов.");
        System.out.println("2. Вывести список по категории продукта.");
        System.out.println("3. Добавить в список новый продукт.");
        System.out.println("4. Внести изменение в список продуктов.");
        System.out.println("5. Выход из базы.");
    }

    public static void menuCategoryChoice() {
        System.out.println("По какой категории вывести список?");
        System.out.println("1. Овощи.");
        System.out.println("2. Фрукты.");
        System.out.println("3. Ягоды.");
        System.out.println("4. Вернуться в главное меню.");
    }

    public static void menuChangeChoice() {
        System.out.println("---------------------");
        System.out.println("1. Полностью измененить выбранный продукт.");
        System.out.println("2. Частичное изменение выбранного продукта.");
        System.out.println("3. Удалить продукт из списка по выбору id.");
        System.out.println("4. Выход в предыдущее меню.");
        System.out.println("---------------------");
    }

    public static void menuAnyDataChange() {
        System.out.println("Какое действие вы желаете сделать?");
        System.out.println("1. Изменить наименование продукта.");
        System.out.println("2. Изменить цену продукта.");
        System.out.println("3. Изменить скидку продукта.");
        System.out.println("4. Изменить описание продукта.");
        System.out.println("5. Выход в предыдущее меню.");
    }
}
