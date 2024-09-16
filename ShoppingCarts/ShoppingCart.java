package ShoppingCarts;

import factories.ProductFactory;
import Tools.ToolFactory;
import Tools.ToolIf;
import Groceries.GroceryFactory;
import Groceries.GroceryIf;

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
        // Tools
        ToolFactory toolBox = new ToolFactory("Tool Test");
        ToolIf tool = toolBox.createItem();  // Create a tool
        toolBox.addItem(tool);
        toolBox.displayItems();
        double toolsTotal = toolBox.getTotalCost() + toolBox.getTotalTax();
        prodCategories.put("Tools", toolsTotal);

        // Groceries
        GroceryFactory groceryBag = new GroceryFactory("Grocery Test");
        GroceryIf grocery = groceryBag.createItem();  // Create a grocery
        groceryBag.addItem(grocery);
        groceryBag.displayItems();
        double groceriesTotal = groceryBag.getTotalCost();
        prodCategories.put("Groceries", groceriesTotal);
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
