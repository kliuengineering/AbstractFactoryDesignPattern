import Groceries.GroceryFactory;
import Tools.ToolFactory;
import Tools.ToolIf;
import Groceries.GroceryIf;

public class TestMain 
{
    public static void main(String[] args) 
    {
        // Test ToolFactory
        ToolFactory toolBox = new ToolFactory("Tool Test");
        ToolIf tool = toolBox.createItem();  // Create a tool
        toolBox.addItem(tool);
        toolBox.displayItems();

        System.out.println("");

        // Test GroceryFactory
        GroceryFactory groceryBag = new GroceryFactory("Grocery Test");
        GroceryIf grocery = groceryBag.createItem();  // Create a grocery
        groceryBag.addItem(grocery);
        groceryBag.displayItems();
    }
}
