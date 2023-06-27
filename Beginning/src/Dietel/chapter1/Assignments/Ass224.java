package Dietel.chapter1.Assignments;

import java.util.Scanner;

public class Ass224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Integer:");
        int a = input.nextInt();

        System.out.print("Enter Second Integer:");
        int b = input.nextInt();

        System.out.print("Enter Third Integer:");
        int c = input.nextInt();

        System.out.print("Enter Fourth Integer:");
        int d = input.nextInt();

        System.out.print("Enter Fifth Integer:");
        int e = input.nextInt();

        if (a > b & a > c & a > d & a > e ) {
            System.out.printf("The Largest Integer is: %d%n" , a );
        }
        if (b > a & b > c & b > d & b > e ) {
            System.out.printf("The Largest Integer is: %d%n" , b );
        }
        if (c > a & c > b & c > d & c > e ) {
            System.out.printf("The Largest Integer is: %d%n" , c );
        }
        if (d > a & d > b & d > c & d > e ) {
            System.out.printf("The Largest Integer is: %d%n" , d );
        }
        if (e > a & e > b & e > c & e > d ) {
            System.out.printf("The Largest Integer is: %d%n" , e );
        }
        if (a < b & a < c & a < d & a < e ) {
            System.out.printf("The Smallest Integer is: %d%n" , a );
        }
        if (b < a & b < c & b < d & b < e ) {
            System.out.printf("The Smallest Integer is: %d%n" , b );
        }
        if (c < a & c < b & c < d & c < e ) {
            System.out.printf("The Smallest Integer is: %d%n" , c );
        }
        if (d < a & d < b & d < c & d < e ) {
            System.out.printf("The Smallest Integer is: %d%n" , d );
        }
        if (e < a & e < b & e < c & e < d ) {
            System.out.printf("The Smallest Integer is: %d%n" , e );
        }
    }
}
