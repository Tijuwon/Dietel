package Dietel.chapter1;
import java.util.Scanner;
public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your First Integer:");
        int number1 = input.nextInt();

        System.out.print("Enter your Second Integer:");
        int number2 = input.nextInt();

        System.out.print("Enter your Third Integer:");
        int number3 = input.nextInt();

        int result = number1 * number2 * number3;
        System.out.printf("The Total Product is: %d" , result );
    }
}
