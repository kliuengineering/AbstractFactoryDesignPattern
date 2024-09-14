// Adapter module to interface the Customer

import java.util.Scanner;

import Groceries.GroceryBag;
import Groceries.GroceryIf;

import Tools.ToolIf;
import Tools.Toolbox;


public class ShoppingCart
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        GroceryBag groceryBag = new GroceryBag("My Grocery Bag");
        GroceryIf[] groceries = new GroceryIf[2];

        Toolbox toolbox = new Toolbox("My Tool Bag");
        ToolIf[] tools = new ToolIf[2];
        
        for (int i = 0; i < groceries.length; i++) 
        {
            GroceryIf grocery = GroceryBag.createGrocery(scanner);
            boolean ret_grocery = groceryBag.addGrocery(grocery);

            if (!ret_grocery) 
            {
                System.out.println("Unable to add the grocery!");
            }

            groceries[i] = grocery;
        }

        for (int i = 0; i < tools.length; i++)
        {
            ToolIf tool = Toolbox.createTool(scanner);
            boolean ret_tool = toolbox.addTool(tool);

            if (!ret_tool) 
            {
                System.out.println("Unable to add the grocery!");
            }

            tools[i] = tool;
        }

        System.out.printf("total cost of tools = $%.2f%n", toolbox.getTotalCost());
        System.out.printf("total cost of groceries = $%.2f%n%n", groceryBag.getTotalCost());
    }
}