
import java.util.Scanner;

public class Test_Scores {

    public static void main(String[] args) {
        double test_Score_1 = 0;
        String test_Score_1_grade = "F";
        double test_Score_2 = 0;
        String test_Score_2_grade = "F";
        double test_Score_3 = 0;
        String test_Score_3_grade = "F";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter test score 1");
        test_Score_1 = keyboard.nextDouble();
        System.out.println("Please enter test score 2");
        test_Score_2 = keyboard.nextDouble();
        System.out.println("Please enter test score 3");
        test_Score_3 = keyboard.nextDouble();

// test score 1
        if (test_Score_1 >= 90) {
            test_Score_1_grade = "A";
        }
        if (test_Score_1 >= 80 && test_Score_1 <= 89) {
            test_Score_1_grade = "B";
        }
        if (test_Score_1 >= 70 && test_Score_1 <= 79) {
            test_Score_1_grade = "C";

        }
        if (test_Score_1 >= 60 && test_Score_1 <= 69) {
            test_Score_1_grade = "D";
        }
        if (test_Score_1 < 60) {
            test_Score_1_grade = "F";
        }

        // test score 2
        if (test_Score_2 >= 90) {
            test_Score_2_grade = "A";
        }
        if (test_Score_2 >= 80 && test_Score_2 <= 89) {
            test_Score_1_grade = "B";
        }
        if (test_Score_2 >= 70 && test_Score_2 <= 79) {
            test_Score_1_grade = "C";

        }
        if (test_Score_2 >= 60 && test_Score_2 <= 69) {
            test_Score_1_grade = "D";
        }
        if (test_Score_2 < 60) {
            test_Score_2_grade = "F";
        }
        // test score 3
        if (test_Score_3 >= 90) {
            test_Score_3_grade = "A";
        }
        if (test_Score_3 >= 80 && test_Score_3 <= 89) {
            test_Score_3_grade = "B";
        }
        if (test_Score_3 >= 70 && test_Score_3 <= 79) {
            test_Score_3_grade = "C";

        }
        if (test_Score_3 >= 60 && test_Score_3 <= 69) {
            test_Score_3_grade = "D";
        }
        if (test_Score_3 < 60) {
            test_Score_3_grade = "F";
        }
        System.out.println("Test score 1 is " + test_Score_1);
        System.out.println("Test score 1 grade = " + test_Score_1_grade);
        System.out.println("Test score 2 is " + test_Score_2);
        System.out.println("Test score 2 grade = " + test_Score_2_grade);
        System.out.println("Test score 3 is " + test_Score_3);
        System.out.println("Test score 3 grade = " + test_Score_3_grade);
    }

//90-100 = A
    //80-89 = B
    //70-79=C
    //60-69=D
    //Below 60=F*/
}
