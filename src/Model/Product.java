package Model;

public class Product {
    private String name;
    private double price;
    private String description;
    private String type;

    public Product(String name, double price, String description, String type) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }
}