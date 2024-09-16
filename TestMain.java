// import Groceries.GroceryFactory;
// import Tools.ToolFactory;
// import Tools.ToolIf;
// import Groceries.GroceryIf;

// public class TestMain 
// {
//     public static void main(String[] args) 
//     {
//         // Test ToolFactory
//         ToolFactory toolBox = new ToolFactory("Tool Test");
//         ToolIf tool = toolBox.createItem();  // Create a tool
//         toolBox.addItem(tool);
//         toolBox.displayItems();

//         System.out.println("");

//         // Test GroceryFactory
//         GroceryFactory groceryBag = new GroceryFactory("Grocery Test");
//         GroceryIf grocery = groceryBag.createItem();  // Create a grocery
//         groceryBag.addItem(grocery);
//         groceryBag.displayItems();
//     }
// }


import RetailStores.RetailStore;
import Customers.Customer;

public class TestMain {
    public static void main(String[] args) {
        RetailStore store = new RetailStore("SuperMart");

        // Create three customers
        Customer customer1 = new Customer("Alice", 500.0);
        Customer customer2 = new Customer("Bob", 300.0);
        Customer customer3 = new Customer("Charlie", 400.0);

        // Add customers to the store
        store.addCustomer(customer1);
        store.addCustomer(customer2);
        store.addCustomer(customer3);

        // Start shopping
        store.startShopping();
    }
}
