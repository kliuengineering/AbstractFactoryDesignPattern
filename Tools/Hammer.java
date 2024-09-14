/*
 * Hammer.java file
 * 
 * This module encapsulates 
 *      - the concrete product (Hammer) 
 */

 
package Tools;

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