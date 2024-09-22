/**
 * RetailStore.java
 * Implements the RetailStore class with a name, a list of customers,
 * and total revenue generated.
 */
package RetailStores;

import Customers.Customer;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class RetailStore {
    // VARIABLES
    private String name; 
    private List<Customer> customers; // List of customers
    private double total; // Total revenue of the store
    private Map<String, Double> prodCategoryRevenue;

    /**
     * Constructor to initialize the retail store with a name.
     * @param name The name of the retail store.
     */
    public RetailStore(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
        this.total = 0.0;
        this.prodCategoryRevenue = new HashMap<>();
    }

    /**
     * Gets the retail store's name.
     * @return The retail store's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a customer to the retail store.
     * Adds the retail store to the customer.
     * @param customer The customer to be added.
     */
    public void addCustomer(Customer customer) {
        customers.add(customer);
        customer.addStore(this);
    }

    /**
     * Calculates the average spend per customer.
     * @return total revenue divided by number of customers
     */
    public double avgSpend() {
        if (customers.size() == 0) {
            return 0.0;
        }
        return total / customers.size();
    }

    /**
     * Calculates the revenue by product category.
     */
    public void revenueByCategory() {
        prodCategoryRevenue.clear();
        for (Customer customer : customers) {
            Map<String, Double> x = customer.getCartTotalByCategory();
            if (x != null) {
                for (Map.Entry<String, Double> entry : x.entrySet()) {
                    String category = entry.getKey();
                    Double amount = entry.getValue();
                    prodCategoryRevenue.put(category, prodCategoryRevenue.getOrDefault(category, 0.0) + amount);
                }
            }
        }
    }

    /**
     * Starts the shopping process for all customers.
     * Displays each customer's shopping cart.
     * Reduces the amount th customer spent on their cart.
     * Displays the report of the store
     */
    public void startShopping() {
        for (Customer customer : customers) {
            System.out.println("==================================================");
            System.out.printf("Start shopping for %s \n", customer.getName());
            System.out.println("==================================================");
            customer.fillShoppingCart();
            customer.display();
            customer.spendCash(customer.getCartTotal());
            total += customer.getCartTotal();
        }
        revenueByCategory();
        display();
    }

    /**
     * Displays the retail store's details, including total revenue, average spend per customer,
     * and revenue by product category.
     */
    public void display() {
        System.out.println("==================================================");
        System.out.printf("RETAIL STORE %s's REPORT\n", name);
        System.out.printf("Total Revenue: $%.2f%n", total);
        System.out.printf("Average Spend per Customer: $%.2f%n", avgSpend());
        System.out.println("Revenue by Product Category:");
        for (Map.Entry<String, Double> entry : prodCategoryRevenue.entrySet()) {
            String category = entry.getKey();
            double revenue = entry.getValue();
            double percentage = (revenue / total) * 100;
            System.out.printf("  %s: $%.2f (%.2f%% of total revenue)%n", category, revenue, percentage);
        }
        System.out.println("==================================================\n");
    }
}