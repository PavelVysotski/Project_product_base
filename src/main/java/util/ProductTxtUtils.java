package util;

import entity.Category;
import entity.Product;
import exceptions.ExceptionMessage;
import exceptions.TxtException;

public class ProductTxtUtils {

    public final static String DELIMITER = ";";

    public static final String[] HEADERS = {"id", "Категория", "Наименование", "Цена", "Скидка", "Описание"};

    public static String headers() {
        return String.join(DELIMITER, HEADERS) + "\n";
    }


    public static String toTxtString(Product product) {
        return product.getId() + DELIMITER +
                product.getCategory() + DELIMITER +
                product.getName() + DELIMITER +
                product.getPrice() + DELIMITER +
                product.getDiscount() + DELIMITER +
                product.getDescription() + "\n";
    }


    public static Product toObject(String txtString) throws TxtException {
        String[] dataArray = txtString.split(DELIMITER);

        if (dataArray.length != 6) {
            String errorMessage = String.format(ExceptionMessage.ERROR_MESSAGE, txtString);
            throw new TxtException(errorMessage);
        }

        long id = Long.parseLong(dataArray[0]);
        String newCategory = dataArray[1];
        Category category = Category.valueOf(newCategory);
        String name = dataArray[2];
        double price = Double.parseDouble(dataArray[3]);
        double discount = Double.parseDouble(dataArray[4]);
        String description = dataArray[5];

        return new Product(id, category, name, price, discount, description);
    }
}
