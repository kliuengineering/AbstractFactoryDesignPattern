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
    private static final double TAX_RATE = 0.14;
    private double tax;

    public Hammer(String name, double cost) 
    {
        this.name = name;
        this.cost = cost;
        this.tax = cost * TAX_RATE;
    }

    @Override
    public double getCost() 
    {
        return cost;
    }

    @Override
    public double getTax()
    {
        return tax;
    }

    @Override
    public void display() 
    {
        System.out.printf("%s is a hammer and costs $%.2f.%n", name, cost);
    }
}