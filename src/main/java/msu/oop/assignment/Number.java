package msu.oop.assignment;

import java.util.Scanner;

/**
 * Object Orinted Programming (CCS20704) - Assignment One. Answer for question
 * two.
 * 
 * @author Ahmad Shah Hafizan Hamidin
 * @version 1.0
 */
public final class Number
{
    /**
     * Integer inputted by user.
     */
    int number;

    /**
     * Class constructor
     * 
     * @param number Number inputted by user
     */
    public Number(int number)
    {
        this.number = number;
    }

    /**
     * Get the inputted number.
     * 
     * @return Number inputted by user
     */
    public int getNumber()
    {
        return this.number;
    }

    /**
     * Set number.
     * 
     * @param number New number to replace the existing one
     */
    public void setNumber(int number)
    {
        this.number = number;
    }

    /**
     * Determine whether number is positive or negative.
     * 
     * @return true or false
     */
    public boolean isPositive()
    {
        if(this.getNumber() > -1) {
            return true;
        }

        return false;
    }

    /**
     * Determine if number is an even or odd number.
     * 
     * @return true or false
     */
    public boolean isEven()
    {
        if(this.getNumber() % 2 == 0) {
            return true;
        }

        return false;
    }

    /**
     * Main method
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        int userInput;

        System.out.println("Odd or Event number identifier.");
        System.out.print("Enter a positive number : ");

        while(true) {
            userInput = inputScanner.nextInt();
            Number number = new Number(userInput);

            if (!number.isPositive()) {
                System.out.print("Enter a positive number : ");
            } else {
                if (number.isEven()) {
                    System.out.println(String.format("%d is an even number.", number.getNumber()));
                    break;
                }

                System.out.println(String.format("%d is an odd number.", number.getNumber()));
                break;
            }
        }
    }
}