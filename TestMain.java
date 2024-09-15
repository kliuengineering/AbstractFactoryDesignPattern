import Groceries.GroceryFactory;
import Tools.ToolFactory;
import Tools.ToolIf;
import Groceries.GroceryIf;

public class TestMain {
    public static void main(String[] args) {
        // Test ToolFactory
        ToolFactory toolFactory = new ToolFactory("Tool Test");
        ToolIf tool = toolFactory.createItem();  // Create a tool
        toolFactory.addItem(tool);
        toolFactory.displayItems();

        // Test GroceryFactory
        GroceryFactory groceryFactory = new GroceryFactory("Grocery Test");
        GroceryIf grocery = groceryFactory.createItem();  // Create a grocery
        groceryFactory.addItem(grocery);
        groceryFactory.displayItems();
    }
}
