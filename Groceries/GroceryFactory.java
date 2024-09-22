/*
 * GroceryFactory
 *      This is the concrete factory interfaced by ProductFactory
 */


 package Groceries;

 import java.util.ArrayList;
 import java.util.List;

import ProductFactory.ProductFactoryIf;
 
 public class GroceryFactory implements ProductFactoryIf<GroceryIf> 
 {
     private String name;
     private double totalCost;
     private List<GroceryIf> items;
     private int numItems;
 
     // constructor
     public GroceryFactory(String name) 
     {
         this.name = name;
         this.totalCost = 0.0;
         this.items = new ArrayList<>();
         this.numItems = 0;
     }
 
     @Override
     public GroceryIf createItem() 
     {
         return CreateGrocery.createGrocery(); // Using CreateGrocery for grocery creation
     }
 
     @Override
     public boolean addItem(GroceryIf grocery) 
     {
         if (!isFull()) 
         {
             items.add(grocery);
             numItems++;
             totalCost += grocery.getCost();
             return true;
         }
         return false;
     }
 
     @Override
     public double getTotalCost() 
     {
         return totalCost;
     }

     @Override
     public double getTotalTax()
     {
        return 0;
     }
 
     @Override
     public void displayItems() 
     {
         System.out.println();
         System.out.println(name + " is a grocery bag with the following items:");
         for (GroceryIf item : items) 
         {
             item.display();
         }
         System.out.printf("The total cost of the groceries is $%.2f%n", totalCost);
     }

    @Override
    public boolean isFull() {
        if (numItems < 2) {
            return false;
        }

        return true;
    }
 }
 