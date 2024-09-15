package Groceries;

import java.util.Scanner;

public class CreateGrocery 
{
    public static GroceryIf createGrocery() 
    {
        Scanner scanner = new Scanner(System.in);
        GroceryIf grocery = null;
        int select;
        String name;
        double cost;
        double calories;

        do 
        {
            System.out.println("Enter 1 for an apple, or");
            System.out.println("Enter 2 for an orange.");
            System.out.print("Selection: ");
            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) 
            {
                case 1:
                    System.out.print("What is the apple's name? ");
                    name = scanner.nextLine();
                    System.out.print("How many calories does this apple have? ");
                    calories = scanner.nextDouble();
                    System.out.print("How much does this apple cost? $");
                    cost = scanner.nextDouble();
                    scanner.nextLine();
                    grocery = new Apple(name, cost, calories);
                    break;

                case 2:
                    System.out.print("What is the orange's name? ");
                    name = scanner.nextLine();
                    System.out.print("How many calories does this orange have? ");
                    calories = scanner.nextDouble();
                    System.out.print("How much does this orange cost? $");
                    cost = scanner.nextDouble();
                    scanner.nextLine();
                    grocery = new Orange(name, cost, calories);
                    break;

                default:
                    System.out.println("Invalid selection, try again!");
            }
            
        } while (select < 1 || select > 2);

        return grocery;
    }
}
