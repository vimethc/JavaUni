package week1;

import java.util.Scanner;

public class ChallengingQuestions3 {
    public static void main(String[] args) {

        int MANUAL_WAGE = 500;
        int SKILLED_WAGE = 700;
        int MANAGEMENT_WAGE = 800;
        double TAX_RATE = 0.20;

        Scanner input = new Scanner(System.in);

        // Read the number of manual, skilled, and management people
        System.out.println("Enter the number of manual people: ");
        int manualPeople = input.nextInt();

        System.out.println("Enter the number of skilled people: ");
        int skilledPeople = input.nextInt();

        System.out.println("Enter the number of management people: ");
        int managementPeople = input.nextInt();

        // Calculate the wage bill
        int wageBill = manualPeople * MANUAL_WAGE + skilledPeople * SKILLED_WAGE + managementPeople * MANAGEMENT_WAGE;

        // Calculate the tax
        double tax = wageBill * TAX_RATE;

        // Print the wage bill and tax
        System.out.println("Wage bill: £" + wageBill);
        System.out.println("Approximate tax to pay (20% of wage bill): £" + tax);
    }
}
