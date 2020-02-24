
import java.util.Scanner;

public class Sum_Of_Numbers {

    public static void main(String[] args) {

        /* Write a program that asks the user for a positive nonzero integer value. 
    The program should use a loop to get the sum of all the integers 
    from 1 up to the number entered. For example, 
    if the user enters 50, the loop will find the sum of 1,2,3,4...50.
         */
        System.out.println("Please enter a positive nonzero integer value ");
        Scanner keyboard = new Scanner(System.in);

        // make an integer variable for the most recent number entered
        int numberEntered = keyboard.nextInt();
                int startNumber= numberEntered;

        int x = 0;

        while (numberEntered > 0) {
            //System.out.println("The value of x is: " + x);
            x = x + numberEntered;
            numberEntered=numberEntered-1;
        }
System.out.println( " The sum of "+startNumber+" = "+ x);
    }
}
