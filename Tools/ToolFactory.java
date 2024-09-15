/*
 * ToolFactory
 *      This is the concrete factory interfaced by ProductFactory
 */


package Tools;

import Factories.ProductFactory;

import java.util.ArrayList;
import java.util.List;

public class ToolFactory implements ProductFactory<ToolIf>
{
    private String name;
    private double totalCost;
    private double totalTax;
    private List<ToolIf> items;
    private int numItems; 

    // constructor
    public ToolFactory(String name) 
    {
        this.name = name;
        this.totalCost = 0.0;
        this.totalTax = 0.0;
        this.items = new ArrayList<>();
        this.numItems = 0;
    }

    @Override
    public ToolIf createItem() 
    {
        return CreateTool.createTool(); // Using CreateTool for tool creation
    }

    @Override
    public boolean addItem(ToolIf tool) 
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

    @Override
    public double getTotalCost()
    {
        return totalCost;
    }

    public double getTotalTax()
    {
        return totalTax;
    }

    @Override
    public void displayItems() 
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






