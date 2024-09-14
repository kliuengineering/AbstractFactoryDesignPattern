/*
 * Screwdriver.java file
 * 
 * This module encapsulates 
 *      - the concrete product (Scredriver) 
 */

 
package Tools;

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