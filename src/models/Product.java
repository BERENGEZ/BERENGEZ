package models;

public class Product {
    String id;
    String name;
    Double price;

    public Product(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }


    public int setPrice(double newPrice) {
        return 0;

    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

