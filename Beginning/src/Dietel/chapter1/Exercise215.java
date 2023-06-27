package Dietel.chapter1;

import java.util.Scanner;

public class Exercise215 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Integer:");
        int x = input.nextInt();

        System.out.print("Enter Your Second Integer:");
        int y = input.nextInt();

        int xSquared = x * x;
        int ySquared = y * y;

        int sum = xSquared + ySquared;
        int diff = xSquared - ySquared;

        System.out.printf("The Square of Your First Integer is: %d%n" , xSquared);
        System.out.printf("The Square of Your Second Integer is: %d%n" , ySquared);
        System.out.printf("The sum of The Squares is: %d%n" , sum);
        System.out.printf("The Difference of Your Squares is: %d%n" , diff);

        System.out.println("You're Welcome to Rerun Your Equations.");

    }
}
