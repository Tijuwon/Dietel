package Dietel.chapter1.Assignments;

import java.util.Scanner;

public class Ass226 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Integer:");
        int a = input.nextInt();

        System.out.print("Enter Your Second Integer:");
        int b = input.nextInt();

        int c = a + a + a;
        int d = b * b;

        if ( c == d ) {
            System.out.printf("The Answer is: %d%n" , c );
        }
        if ( c != d ) {
            System.out.print("Your Equation is Incorrect");
        }

    }
}
