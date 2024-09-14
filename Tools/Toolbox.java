/*
 * Toolbox.java file
 */


package Tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Toolbox 
{
    private String name;
    private double totalCost;
    private double totalTax;
    private List<ToolIf> items;
    private int numItems;


    public static ToolIf createTool(Scanner scanner) 
    {
        ToolIf tool = null;
        int select;
        String name;
        double cost;

        do 
        {
            System.out.println();
            System.out.println("Enter 1 for a hammer, or");
            System.out.println("Enter 2 for a screwdriver.");
            System.out.print("Selection: ");
            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) 
            {
                case 1:
                    System.out.print("What is the hammer's name? ");
                    name = scanner.nextLine();
                    System.out.print("How much does this hammer cost? $");
                    cost = scanner.nextDouble();
                    scanner.nextLine();
                    tool = new Hammer(name, cost);
                    break;
                case 2:
                    System.out.print("What is the screwdriver's name? ");
                    name = scanner.nextLine();
                    System.out.print("How much does this screwdriver cost? $");
                    cost = scanner.nextDouble();
                    scanner.nextLine();
                    tool = new Screwdriver(name, cost);
                    break;
                default:
                    System.out.println("Invalid selection, try again!");
            }
        } while (select < 1 || select > 2); // Repeat for an invalid selection

        return tool;
    }
    
    // constructor
    public Toolbox(String name) 
    {
        this.name = name;
        this.totalCost = 0.0;
        this.totalTax = 0.0;
        this.items = new ArrayList<>();
        this.numItems = 0;
    }

    public boolean addTool(ToolIf tool) 
    {
        if (numItems < 4) 
        {
            items.add(tool);
            numItems++;
            totalCost += tool.getCost();
            totalTax += tool.getTax();
            return true;
        }
        return false;
    }

    public double getTotalCost()
    {
        return totalCost;
    }

    public double getTotalTax()
    {
        return totalTax;
    }

    public void display() 
    {
        System.out.println();
        System.out.println(name + " is a toolbox with the following items:");
        for (ToolIf item : items) 
        {
            item.display();
        }
        System.out.printf("The total cost of the tools is $%.2f%n", totalCost);
    }
}






