package entity;

import java.math.BigDecimal;

public class Product {

    private long id;
    private Category category;
    private String name;
    private BigDecimal price;
    private BigDecimal discount;
    private String description;

    public Product(long id, Category category, String name, double price, double discount, String description) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = BigDecimal.valueOf(price);
        this.discount = BigDecimal.valueOf(discount);
        this.description = description;
    }


    @Override
    public String toString() {
        return "id: " + id + ", " + category + ", " + name + ", цена:" + price + ", скидка:" + discount + ", " + description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
