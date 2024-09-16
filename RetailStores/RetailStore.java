package RetailStores;

import Customers.Customer;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class RetailStore {
    // VARIABLES
    private String name;
    private List<Customer> customers;
    private double total;
    private Map<String, Double> prodCategoryRevenue;

    // Constructor
    public RetailStore(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
        this.total = 0.0;
        this.prodCategoryRevenue = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    // addCustomer method
    public void addCustomer(Customer customer) {
        customers.add(customer);
        customer.addStore(this);
    }

    // avgSpend method
    public double avgSpend() {
        if (customers.size() == 0) {
            return 0.0;
        }
        return totalRevenue() / customers.size();
    }

    // totalRevenue method
    public double totalRevenue() {
        total = 0.0;
        for (Customer customer : customers) {
            total += customer.getCartTotal();
        }
        return total;
    }

    // revenueByCategory method
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

    // startShopping method
    public void startShopping() {
        for (Customer customer : customers) {
            customer.fillShoppingCart();
            customer.display();
            customer.spendCash(customer.getCartTotal());
        }
        totalRevenue();
        revenueByCategory();
        display();
    }

    // display method
    public void display() {
        System.out.println("==================================================");
        System.out.printf("Retail Store: %s%n", name);
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
