package week1;

import java.util.Scanner;

public class ChallengingQuestions1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First name: ");
        String fname = input.nextLine();

        System.out.println("Enter your First name: ");
        String lname = input.nextLine();

        String initialFName = fname.substring(0,1);
        String initialLName = lname.substring(0,1);

        System.out.println("Hello " + initialFName + initialLName + ".");
    }
}
