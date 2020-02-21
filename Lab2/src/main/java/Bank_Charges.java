
import java.util.Scanner;

public class Bank_Charges {

    public static void main(String[] args) {
        int checks = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of checks written for this month");
        checks = keyboard.nextInt();


        /*A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:

$0.10 each for less than 20 checks

$0.08 each for 20-39 checks

$0.06 each for 40-59 checks

$0.04 each for 60 or more checks*/
        final int BASEFEE = 10;
        double checksCharge = 0;
        double total =0;
        if (checks <= 20) {
            checksCharge = .1;
        }

        if (checks >= 20 && checks <= 39) {
            checksCharge = .08;
        }
        if (checks >= 40 && checks <= 59) {
            checksCharge = .08;
        }

        if (checks >= 60) {
            checksCharge = .04;
        }
        total=BASEFEE+checksCharge;
System.out.println("your total is\t"+ total);
    }
}
