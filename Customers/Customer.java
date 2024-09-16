package Customers;

/**
 * Customer
 */

import ShoppingCarts.ShoppingCart;
import RetailStores.RetailStore;
import java.util.Map;

public class Customer {

    // VARIABLES
    private String name;
    private double cash;
    private RetailStore store;
    private ShoppingCart cart;

    // Constructor
    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
        this.store = null;
        this.cart = null;
    }

    // addStore method
    public void addStore(RetailStore store) {
        this.store = store;
    }

    // fillShoppingCart method
    public void fillShoppingCart() {
        if (cart == null) {
            cart = new ShoppingCart();
        }
        cart.start();
    }

    // addCash method
    public void addCash(double amt) {
        this.cash += amt;
    }

    // spendCash method
    public void spendCash(double amt) {
        this.cash -= amt;
    }

    // getCartTotal method
    public double getCartTotal() {
        return cart != null ? cart.getCartTotal() : 0.0;
    }

    // getCartTotalByCategory method
    public Map<String, Double> getCartTotalByCategory() {
        return cart != null ? cart.getCostByCategory() : null;
    }

    // display method
    public void display() {
        System.out.println("--------------------------------------------------");
        System.out.println("Customer Name: " + name);
        System.out.printf("Available Cash: $%.2f%n", cash);
        System.out.println("Store: " + (store != null ? store.getName() : "No store assigned"));
        System.out.printf("Total Cart Cost: $%.2f%n", getCartTotal());
        System.out.println("Cost by Category:");
        Map<String, Double> costByCategory = getCartTotalByCategory();
        if (costByCategory != null) {
            for (Map.Entry<String, Double> entry : costByCategory.entrySet()) {
                System.out.printf("  %s: $%.2f%n", entry.getKey(), entry.getValue());
            }
        } else {
            System.out.println("  No items in cart.");
        }
        System.out.println("--------------------------------------------------\n");
    }
}
