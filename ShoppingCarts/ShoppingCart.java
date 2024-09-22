/**
 * ShoppingCart.java
 * Creates the shopping cart for a customer with
 * a mmap to store the amount spent in each category
 */
 package ShoppingCarts;

import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    // VARIABLES
    private Map<String, Double> prodCategories;

    // Constructor
    public ShoppingCart() {
        prodCategories = new HashMap<>();
    }

    // start method
    public void start() {
        prodCategories = CreateProductFactories.createProductFactories();
    }

    // getCostByCategory method
    public Map<String, Double> getCostByCategory() {
        return prodCategories;
    }

    // getCartTotal method
    public double getCartTotal() {
        double total = 0.0;
        for (double amount : prodCategories.values()) {
            total += amount;
        }
        return total;
    }
}
