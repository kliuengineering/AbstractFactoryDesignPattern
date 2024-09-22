/**
 * TestMain.java
 * Test Module for the RetailStore application.
 * Creates a retail store and adds customers to it.
 * The customers then start shopping in the store.
 */
import RetailStores.RetailStore;
import Customers.Customer;

public class TestMain {
    public static void main(String[] args) {
        // Create a new retail store named "SuperMart"
        RetailStore store = new RetailStore("SuperMart");

        // Create three customers with initial balances
        Customer customer1 = new Customer("Alice", 500.0);
        Customer customer2 = new Customer("Bob", 300.0);
        Customer customer3 = new Customer("Charlie", 400.0);

        // Add customers to the store
        store.addCustomer(customer1);
        store.addCustomer(customer2);
        store.addCustomer(customer3);

        // Start the shopping process for all customers
        store.startShopping();
    }
}
