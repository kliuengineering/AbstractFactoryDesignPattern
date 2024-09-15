/*
 * Shopping Cart Module (currently act as the main for testing purposes, 
 * but later we want to implement this as an interface class for the bigger system)
 * 
 * Things to fix:
 *      1. we should not pass scanner from ShoppingCart to Toolbox and Scredriver
 *          - this is because we are now coupling those classes together
 */


import java.util.Scanner;

import Groceries.GroceryBag;
import Groceries.GroceryIf;

import Tools.ToolIf;
import Tools.ToolFactory;


public class ShoppingCart
{
    public static void main(String[] args)
    {
        GroceryBag groceryBag = new GroceryBag("My Grocery Bag");
        GroceryIf[] groceries = new GroceryIf[2];

        ToolFactory toolbox = new ToolFactory("My Tool Bag");
        ToolIf[] tools = new ToolIf[2];
        
        for (int i = 0; i < groceries.length; i++) 
        {
            GroceryIf grocery = GroceryBag.createGrocery();
            boolean ret_grocery = groceryBag.addGrocery(grocery);

            if (!ret_grocery) 
            {
                System.out.println("Unable to add the grocery!");
            }

            groceries[i] = grocery;
        }

        for (int i = 0; i < tools.length; i++)
        {
            ToolIf tool = ToolFactory.createTool();
            boolean ret_tool = toolbox.addTool(tool);

            if (!ret_tool) 
            {
                System.out.println("Unable to add the grocery!");
            }

            tools[i] = tool;
        }

        System.out.printf("total cost of tools = $%.2f%n", toolbox.getTotalCost());
        System.out.printf("total tax of tools = $%.2f%n", toolbox.getTotalTax());
        System.out.printf("total cost of groceries = $%.2f%n%n", groceryBag.getTotalCost());
    }
}