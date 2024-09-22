/*
 * CreateProductFactories.java
 * Used by ShoppingCart.java to create 
 * the ToolFactory and the GroceryFactory in the cart.
*/
package ShoppingCarts;

import Groceries.GroceryFactory;
import Groceries.GroceryIf;
import ProductFactory.ProductFactoryIf;
import Tools.ToolFactory;
import Tools.ToolIf;

import java.util.Map;
import java.util.HashMap;

public class CreateProductFactories {
    public static Map<String, Double> createProductFactories()
    {
        Map<String, Double> prodCategories = new HashMap<>();

        // Tools
        ProductFactoryIf<ToolIf> toolBox = new ToolFactory("Tool Test");
        while (!toolBox.isFull()) {
            ToolIf tool = toolBox.createItem();  // Create a tool
            toolBox.addItem(tool);
        } 
        toolBox.displayItems();
        double toolsTotal = toolBox.getTotalCost();
        prodCategories.put("Tools", toolsTotal);

        // Groceries
        ProductFactoryIf<GroceryIf> groceryBag = new GroceryFactory("Grocery Test");
        while (!groceryBag.isFull()) {
            GroceryIf grocery = groceryBag.createItem();  // Create a grocery
            groceryBag.addItem(grocery);
        } 
        groceryBag.displayItems();
        double groceriesTotal = groceryBag.getTotalCost();
        prodCategories.put("Groceries", groceriesTotal);

        return prodCategories;
    }
}
