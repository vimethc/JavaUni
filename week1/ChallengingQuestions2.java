package week1;

import java.util.Scanner;

public class ChallengingQuestions2 {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length in meters: ");

        double meters = input.nextDouble();
        double centimeters = meters * 100 ;

        System.out.println(meters + " meters is equal to " + centimeters + " centimeters.");

    }
}
