/*
 * ProductFactoryIf.java
 * Interface class to create different product categories
 * like groceyr, tools etc.
*/
package ProductFactory;

public interface ProductFactoryIf<T> 
{
    T createItem();  // Factory method to create an item (tool or grocery)
    boolean addItem(T item);  // Adds an item to the collection
    double getTotalCost();  // Calculates total cost of the collection
    double getTotalTax();   // Calculates total tax for the collection
    void displayItems();  // Displays all the items in the collection
    boolean isFull(); //checks if the category is full
}