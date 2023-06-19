import models.Product;
import models.Product;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Product> productInventory = new HashMap<>();


        Product product1 = new Product("P001", "Tomatoes", 5.00);
        Product product2 = new Product("P002", "Potatoes", 4.00);
        Product product3 = new Product("P003", "Spinach", 5.99);

        productInventory.put(product1.getId(), product1);
        productInventory.put(product2.getId(), product2);
        productInventory.put(product3.getId(), product3);


        System.out.println("Total number of products in inventory: " + productInventory.size());


        String productId = "P002";
        if (productInventory.containsKey(productId)) {
            Product specificProduct = productInventory.get(productId);
            System.out.println("Details of Product with ID " + productId + ":");
            System.out.println("Name: " + specificProduct.getName());
            System.out.println("Price: " + specificProduct.getPrice());
        } else {
            System.out.println("Product with ID " + productId + " not found in the inventory.");
        }


        String productIdToRemove = "P003";
        if (productInventory.containsKey(productIdToRemove)) {
            productInventory.remove(productIdToRemove);
            System.out.println("Product with ID " + productIdToRemove + " removed from the inventory.");
        } else {
            System.out.println("Product with ID " + productIdToRemove + " not found in the inventory.");
        }


        String productIdToUpdate = "P001";
        double newPrice = 12.99;
        if (productInventory.containsKey(productIdToUpdate)) {
            Product productToUpdate = productInventory.get(productIdToUpdate);
            productToUpdate.setPrice(newPrice);
            System.out.println("Price of Product with ID " + productIdToUpdate + " updated to " + newPrice);
        } else {
            System.out.println("Product with ID " + productIdToUpdate + " not found in the inventory.");
        }


        double totalValue = 0.0;
        for (Product product : productInventory.values()) {
            totalValue += product.getPrice();
        }
        System.out.println("Total value of the inventory: " + totalValue);
    }
}
