package task.epam.epamTask6;

import java.util.*;
import java.io.*;

public class App 
{
    public static void main( String[] args )
    {
    	CustomCollection obj = new CustomCollection();
        PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
        ps.println("1.Add element to the list ");
        ps.println("2.Remove an element from the list");
        ps.println("3.Print the List");
        ps.println("4.Fetch an element");
        ps.println("5.Exit");
        while (true) {
        	
            try {
            	ps.println("Enter your choice (1-5) :");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        ps.println("Enter element to be added: ");
                        String s1 = sc.next();
                        String s2 = sc.nextLine();
                        obj.add(s1 + s2);
                        break;
                    case 2:
                        ps.println("Enter the index of the element to be deleted: ");
                        int j = sc.nextInt();
                        obj.remove(j);
                        break;
                    case 3:
                    	ps.println("The elements present in the List are : " + obj);
                        break;
                    case 4:
                    	ps.println("Enter the index to be fetched:");
                    	int i=sc.nextInt();
                    	obj.fetch(i);
                    	break;

                    case 5:
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                    	ps.println("Invalid selection...");
                }
            } 
            catch (InputMismatchException e) {
                System.out.println("Please enter an integer between 1-4");
            }
        }
    }
}

