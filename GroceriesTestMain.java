import java.util.Scanner;
import Groceries.GroceryBag;
import Groceries.GroceryIf;


public class GroceriesTestMain
{
    public static void main(String[] args)
    {
        GroceryBag groceryBag = new GroceryBag("Data Processing Support");
        GroceryIf[] groceries = new GroceryIf[2];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < groceries.length; i++) 
        {
            GroceryIf grocery = GroceryBag.createGrocery(scanner);
            boolean ret = groceryBag.addGrocery(grocery);

            if (!ret) 
            {
                System.out.println("Unable to add the grocery!");
            }

            groceries[i] = grocery;
        }

        groceryBag.display();
    }
}