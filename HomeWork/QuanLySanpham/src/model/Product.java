package model;

public class Product {
    private String id;
    private String name;
    private String description;
    private int quantity;
    private double price;
    private String unit;

    public Product(String id, String name, String description, int quantity, double price, String unit) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.unit = unit;
    }

    public void printInfo(){
        String printInfo = "id = " + id + " name = " + name + " description = " + description + " quantity = " + quantity + " price = " + price + " unit = " + unit;
        System.out.println(printInfo);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
