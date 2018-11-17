package msu.oop.assignment.jusco;

import java.util.Scanner;

/**
 * Object Orinted Programming (CCS20704) - Assignment One. Answer for question
 * five.
 * 
 * @author Ahmad Shah Hafizan Hamidin
 * @version 1.0
 */
public final class Testing
{
    /**
     * Main method
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        Scanner customerScanner = new Scanner(System.in);
        String name, address;
        int point;

        System.out.println("Java Jusco (JJ) Sdn Bhd Reward Point System");
        System.out.println("-------------------------------------------");

        System.out.print("Enter customer's name : ");
        name = customerScanner.nextLine();

        System.out.print("Enter customer's address : ");
        address = customerScanner.nextLine();

        System.out.print("Enter customer's point : ");
        point = customerScanner.nextInt();

        Customer customer = new Customer(name, address, point);

        System.out.println("-------------------------------------------");
        
        System.out.println(String.format("Total reward points for %s is %d", name, customer.calculatePoint()));
        System.exit(0);
    }
}