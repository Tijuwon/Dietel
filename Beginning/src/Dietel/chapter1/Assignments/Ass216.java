package Dietel.chapter1.Assignments;

import java.util.Scanner;

public class Ass216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Integer:");
        int a = input.nextInt();

        int b = a * a;
        int c = 100;
        if (b > c){
            System.out.println("Integer Squared is greater than 100");
        }
        if (b == c) {
            System.out.println("Integer Squared is Equal to 100");
        }
        if (b != c) {
            System.out.println("Integer Squared is not equal to 100");
        }
        if (b < c) {
            System.out.println("Integer Squared is Less than 100");
        }
    }
}
