
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
        String store1count = "";
        String store2count = "";
        String store3count = "";
        String store4count = "";
        String store5count = "";
        System.out.println("Please enter today's sales for store 1 ");
        store1 = keyboard.nextDouble();

        System.out.println("Please enter today's sales for store 2 ");
        store2 = keyboard.nextDouble();
        System.out.println("Please enter today's sales for store 3 ");
        store3 = keyboard.nextDouble();
        System.out.println("Please enter today's sales for store 4 ");
        store4 = keyboard.nextDouble();
        System.out.println("Please enter today's sales for store 5 ");
        store5 = keyboard.nextDouble();

        for (double i = store1; i >= 100; i = i - 100) {

            store1count = store1count + "*";
        }
        for (double i = store2; i >= 100; i = i - 100) {

            store2count = store2count + "*";
        }
        for (double i = store3; i >= 100; i = i - 100) {

            store3count = store3count + "*";
        }
        for (double i = store4; i >= 100; i = i - 100) {

            store4count = store4count + "*";
        }
        for (double i = store5; i >= 100; i = i - 100) {

            store5count = store5count + "*";
        }
        System.out.println("SALES BAR CHART");
        System.out.println("today's sales for store 1 is " + store1);
        System.out.println("today's sales for store 2 is " + store2);
        System.out.println("today's sales for store 3 is " + store3);
        System.out.println("today's sales for store 4 is " + store4);
        System.out.println("today's sales for store 5 is " + store5);
        System.out.println("SALES BAR CHART");
        System.out.println("Store 1: " + store1count);
        System.out.println("Store 2: " + store2count);
        System.out.println("Store 3: " + store3count);
        System.out.println("Store 4: " + store4count);
        System.out.println("Store 5: " + store5count);
    }

}
