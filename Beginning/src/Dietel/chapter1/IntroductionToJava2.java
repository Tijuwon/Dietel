package Dietel.chapter1;
import java.util.Scanner;

public class IntroductionToJava2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Integer:");
        int number1 = input.nextInt();

        System.out.print("Enter Second Integer");
        int number2 = input.nextInt();

        int sum = number1 + number2;

        System.out.printf("Total is %d%n" , sum);
    }
}
