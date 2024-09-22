/*
 * ToolFactory
 *      This is the concrete factory interfaced by ProductFactory
 */


package Tools;

import java.util.ArrayList;
import java.util.List;

import ProductFactory.ProductFactoryIf;

public class ToolFactory implements ProductFactoryIf<ToolIf>
{
    private String name;
    private double preTaxCost;
    private double tax = 0.14;
    private List<ToolIf> items;
    private int numItems; 

    // constructor
    public ToolFactory(String name) 
    {
        this.name = name;
        this.preTaxCost = 0.0;
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
        if (!isFull()) 
        {
            items.add(tool);
            numItems++;
            preTaxCost += tool.getCost();
            return true;
        }
        return false;
    }

    @Override
    public double getTotalCost()
    {
        return preTaxCost+getTotalTax();
    }

    @Override
    public double getTotalTax()
    {
        return tax*preTaxCost;
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
        System.out.printf("The total cost of the tools before tax is $%.2f%n", preTaxCost);
        System.out.printf("The total tax of the tools is $%.2f%n", getTotalTax());
        System.out.printf("The total cost of the tools is $%.2f%n", getTotalCost());

    }

    @Override
    public boolean isFull() {
        if (numItems < 2) {
            return false;
        }

        return true;
    }
}






