/*
 * CreateTool.java
 * Used for the creation of tools by ToolFactory.java
 */

package Tools;

import java.util.Scanner;

public class CreateTool
{
    public static ToolIf createTool()
    {
        Scanner scanner = new Scanner(System.in);
        ToolIf tool = null;
        int select;
        String name;
        double cost;

        do
        {   
            System.out.println("\nEnter 1 for a hammer, or");
            System.out.println("Enter 2 for a screwdriver.");
            System.out.print("Selection: ");  
            select = scanner.nextInt(); 
            scanner.nextLine();

            switch (select)
            {
                case 1:
                    System.out.print("What is the hammer's name? ");
                    name = scanner.nextLine();
                    System.out.print("How much does this hammer cost? $");
                    cost = scanner.nextDouble(); scanner.nextLine();
                    tool = new Hammer(name, cost);
                    break;

                case 2:
                    System.out.print("What is the screwdriver's name? ");
                    name = scanner.nextLine();
                    System.out.print("How much does this screwdriver cost? $");
                    cost = scanner.nextDouble(); scanner.nextLine();
                    tool = new Screwdriver(name, cost);
                    break;

                default:
                    System.out.println("Invalid selection, try again!");
            }
        }
        while( select < 1 || select >2 );

        return tool;
    }
}