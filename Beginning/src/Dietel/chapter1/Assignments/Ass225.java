package Dietel.chapter1.Assignments;

import java.util.Scanner;

public class Ass225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Integer:");
        int a = input.nextInt();

        int b = a%3;

        if ( b == 0 ) {
            System.out.print("Your integer is divisible by 3");
        }
        if ( b != 0 ) {
            System.out.print("Your integer is not divisible by 3");
        }
    }
}
