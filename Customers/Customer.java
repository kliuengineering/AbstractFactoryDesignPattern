/**
 * Customer.java
 * The Customer class represents a customer in the retail store system.
 * Each customer has a name, available cash, a reference to the store they are shopping in,
 * and a shopping cart to hold their items.
 */
package Customers;

import ShoppingCarts.ShoppingCart;
import RetailStores.RetailStore;
import java.util.Map;

public class Customer {

    // VARIABLES
    private String name; // Name of the customer
    private double cash; // Available cash for the customer
    private RetailStore store; // Store the customer is shopping in
    private ShoppingCart cart; // Shopping cart for the customer

    /**
     * Constructor to initialize a customer with a name and available cash.
     * @param name The name of the customer.
     * @param cash The initial amount of cash the customer has.
     */
    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
        this.store = null;
        this.cart = null;
    }

    /**
     * Gets the name of the customer
     * @return customer name
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a store reference to the customer.
     * @param store The retail store the customer is shopping in.
     */
    public void addStore(RetailStore store) {
        this.store = store;
    }

    /**
     * Fills the customer's shopping cart with items.
     * Initializes the shopping cart if it is null.
     */
    public void fillShoppingCart() {
        if (cart == null) {
            cart = new ShoppingCart();
        }
        cart.start();
    }

    /**
     * Adds cash to the customer's available cash.
     * @param amt The amount of cash to be added.
     */
    public void addCash(double amt) {
        this.cash += amt;
    }

    /**
     * Deducts cash from the customer's available cash.
     * @param amt The amount of cash to be deducted.
     */
    public void spendCash(double amt) {
        this.cash -= amt;
    }

    /**
     * Gets the total cost of items in the customer's shopping cart.
     * @return The total cost of items in the customer's cart.
     */
    public double getCartTotal() {
        return cart != null ? cart.getCartTotal() : 0.0;
    }

    /**
     * Gets the total cost of items in the customer's shopping cart by category.
     * @return A map of category names to total costs of items belonging to that category
     */
    public Map<String, Double> getCartTotalByCategory() {
        return cart != null ? cart.getCostByCategory() : null;
    }

    /**
     * Displays the customer's details, including name, available cash, store, and cart details.
     */
    public void display() {
        System.out.println("--------------------------------------------------");
        System.out.println("Customer Name: " + name);
        System.out.printf("Available Cash: $%.2f%n", cash);
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
