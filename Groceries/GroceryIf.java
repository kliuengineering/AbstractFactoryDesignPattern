/*
 * GroceryIf.java file
 * 
 * This module encapsulates
 *      - the abstract product (groceries)
 *      - the concrete product (apple, orange)
 */

package Groceries;

public interface GroceryIf 
{
    double getCost();
    void display();
}

class Apple implements GroceryIf 
{
    private String name;
    private double cost;
    private double calories;

    public Apple(String name, double cost, double calories) 
    {
        this.name = name;
        this.cost = cost;
        this.calories = calories;
    }

    @Override
    public double getCost() 
    {
        return cost;
    }

    @Override
    public void display() 
    {
        System.out.printf("%s is an apple. It has %.2f calories and costs $%.2f.%n", name, calories, cost);
    }
}

class Orange implements GroceryIf 
{
    private String name;
    private double cost;
    private double calories;

    public Orange(String name, double cost, double calories) 
    {
        this.name = name;
        this.cost = cost;
        this.calories = calories;
    }

    @Override
    public double getCost() 
    {
        return cost;
    }

    @Override
    public void display() 
    {
        System.out.printf("%s is an orange. It has %.2f calories and costs $%.2f.%n", name, calories, cost);
    }
}