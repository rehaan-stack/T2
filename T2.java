import java.util.Scanner;

public class Studentgrade {
    String again;
    String name;
    Scanner scanner = new Scanner(System.in);
    float total;
    float percent;
    int n;
    float[] marks = new float[100];

    Studentgrade() { // constructor

        do {
            System.out.println("Enter the Student Name : ");
            name = scanner.nextLine();
            System.out.println("Hello " + name + ",Please Enter the how many Subjects are there for You : ");
            n = scanner.nextInt();
            System.out.println("Hey " + name + ",Now Enter the Marks for " + n + " Subjects below: ");
            inpu2();
            total1();
            details();
            grades();
            System.out.println("Do You Want To Calculate Grades for Another Students [yes/no]: ");
            again = scanner.next();
        } while (again.equalsIgnoreCase("yes"));
        System.out.println("Thankyou for Visiting ....");
    }

    int inpu2() {

        for (int i = 0; i < n; i++) { // For Loop for Taking inputs..
            System.out.println("Enter the Marks of " + (i + 1) + " Subject");
            marks[i] = scanner.nextFloat();
        }

        return 0;
    } /// imput funci

    int total1() {
        total = 0;
        for (int i = 0; i < n; i++) { // For Loop for calculatoring total marks..
            total += marks[i];
        }
        return 0;
    } // total end

    int details() {
        percent = (float) (total / n);
        System.out.println("The Student Name is " + name);
        System.out.println("The Student Total Marks of " + n + " Subjects are  " + total);
        System.out.println("The Student Percentage is " + percent);
        return 0;
    }// deatail end
     // if else - elseif laddar

    int grades() {
        if (percent >= 90) {
            System.out.println("The Grade is A");
        } else if (percent >= 80) {
            System.out.println("The Grade is B ");
        } else if (percent >= 70) {
            System.out.println("The Grade is C ");
        } else if (percent >= 60) {
            System.out.println("The Grade is D");
        } else if (percent >= 50) {
            System.out.println("the Grade is E+ ");
        } else if (percent >= 40) {
            System.out.println("The Grade is E");
        } else {
            System.out.println("NO GRADE IS AVAILIABLE ");
            System.out.println("FAILED");
        }
        if (percent >= 40) {
            System.out.println("STUDENT PASSED.");
            System.out.println("ThankYou For Calculatoring the Grade...");
        }
        return 0;
    }// grades

    // End of Constructor
    public static void main(String[] args) { // Main Functiion
        Studentgrade sg = new Studentgrade(); // Creating Class object here
    }
}