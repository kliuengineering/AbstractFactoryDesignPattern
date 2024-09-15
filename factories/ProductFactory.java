package factories;

public interface ProductFactory<T> 
{
    T createItem();  // Factory method to create an item (tool or grocery)
    boolean addItem(T item);  // Adds an item to the collection
    double getTotalCost();  // Calculates total cost
    double getTotalTax();   // Calculates total tax
    void displayItems();  // Displays the items
}