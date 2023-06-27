package Dietel.chapter1.Assignments;

import java.util.Scanner;

public class Ass217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Integer:");
        int a = input.nextInt();

        System.out.print("Enter Your Second Integer:");
        int b = input.nextInt();

        System.out.print("Enter Your Third Integer:");
        int c = input.nextInt();



        int sum = a + b + c;
        int Ave = a * b * c / 2;
        int pro = a * b * c;


        System.out.printf("The Sum Of Your Integers Equal: %d%n" , sum);
        System.out.printf("The Average Total Of Your Integers Equal: %d%n" , Ave);
        System.out.printf("The Product Of Your Integers Equal: %d%n" , pro);

        if (a > b & a > c) {
            System.out.printf("The Largest Integer is: %d%n" , a);
        }
        if (b > a & b > c) {
            System.out.printf("The Largest Integer is: %d%n" , b);
        }
        if (c > a & c > b) {
            System.out.printf("The Largest Integer is: %d%n" , c);
        }
        if (a < b & a < c) {
            System.out.printf("The Smallest Integer is: %d%n" , a);
        }
        if (b < a & b < c) {
            System.out.printf("The Smallest Integer is: %d%n" , b);
        }
        if (c < a & c < b) {
            System.out.printf("The Smallest Integer is: %d%n" , c);
        }




    }
}
