package Groceries;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GroceryBag 
{
    private String name;
    private double totalCost;
    private List<GroceryIf> items;
    private int numItems = 4;


    public static GroceryIf createGrocery(Scanner scanner) 
    {
        GroceryIf grocery = null;
        int select = 0;
        String name;
        double cost;
        double calories;
        
        do 
        {
            System.out.println();
            System.out.println("Enter 1 for an apple, or");
            System.out.println("Enter 2 for an orange.");
            System.out.print("Selection: ");
            select = scanner.nextInt();
            scanner.nextLine();
            
            switch (select) 
            {
                case 1:
                    System.out.print("What is the apple's name? ");
                    name = scanner.nextLine();
                    System.out.print("How many calories does this apple have? ");
                    calories = scanner.nextDouble();
                    System.out.print("How much does this apple cost? $");
                    cost = scanner.nextDouble();
                    grocery = new Apple(name, cost, calories);
                    break;
                case 2:
                    System.out.print("What is the orange's name? ");
                    name = scanner.nextLine();
                    System.out.print("How many calories does this orange have? ");
                    calories = scanner.nextDouble();
                    System.out.print("How much does this orange cost? $");
                    cost = scanner.nextDouble();
                    grocery = new Orange(name, cost, calories);
                    break;
                default:
                    System.out.println("Invalid selection, try again!");
            }
        } while (select < 1 || select > 2); // Repeat for an invalid selection

        return grocery;
    }
    
    // constructor
    public GroceryBag(String name) 
    {
        this.name = name;
        this.totalCost = 0.0;
        this.items = new ArrayList<>();
        this.numItems = 0;
    }

    public boolean addGrocery(GroceryIf grocery) 
    {
        if (numItems < 4) 
        {
            items.add(grocery);
            numItems++;
            totalCost += grocery.getCost();
            return true;
        } 
        return false;
    }

    public double getTotalCost()
    {
        return totalCost;
    }

    public void display() 
    {
        System.out.println();
        System.out.println(name + " is a grocery bag with the following items:");
        for (GroceryIf item : items) 
        {
            item.display();
        }
        System.out.printf("The total cost of the groceries is $%.2f%n%n", totalCost);
    }
}