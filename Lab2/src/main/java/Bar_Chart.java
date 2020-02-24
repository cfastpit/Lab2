
import java.util.Scanner;

/*Write a program that asks the user to enter today's sales for five stores.
The program should display a bar chart comparing each store's sales.
Create each bar chart in the bar chart by displaying a row of asterisks. 
Each asterisk Should represent $100 of sales. 
Here is an example of the program's output:
 */
public class Bar_Chart {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double store1 = 0;
        double store2 = 0;
        double store3 = 0;
        double store4 = 0;
        double store5 = 0;
        System.out.println("Please enter today's sales for store 1 ");
        store1 = keyboard.nextDouble();
        System.out.println("Please enter today's sales for store 1 ");
        store2 = keyboard.nextDouble();
        System.out.println("Please enter today's sales for store 1 ");
        store3 = keyboard.nextDouble();
        System.out.println("Please enter today's sales for store 1 ");
        store4 = keyboard.nextDouble();
        System.out.println("Please enter today's sales for store 1 ");
       // store5 = keyboard.nextDouble();System.out.println (store1);
    }

    
}
