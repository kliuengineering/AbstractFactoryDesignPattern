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
    private static final double TAX_RATE = 0.14;
    private double tax;

    public Screwdriver(String name, double cost) 
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
        System.out.printf("%s is a screwdriver and costs $%.2f.%n", name, cost);
    }
}