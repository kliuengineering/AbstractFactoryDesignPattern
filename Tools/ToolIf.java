/*
 * ToolIf.java file
 * 
 * This module encapsulates 
 *      - the abstract product (tools) 
 *      - the concrete product (hammer, scredriver)
 */

package Tools;

public interface ToolIf 
{
    double getCost();
    void display();
}

class Hammer implements ToolIf 
{
    private String name;
    private double cost;

    public Hammer(String name, double cost) 
    {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double getCost() 
    {
        return cost;
    }

    @Override
    public void display() 
    {
        System.out.printf("%s is a hammer and costs $%.2f.%n", name, cost);
    }
}

class Screwdriver implements ToolIf 
{
    private String name;
    private double cost;

    public Screwdriver(String name, double cost) 
    {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double getCost() 
    {
        return cost;
    }

    @Override
    public void display() 
    {
        System.out.printf("%s is a screwdriver and costs $%.2f.%n", name, cost);
    }
}
