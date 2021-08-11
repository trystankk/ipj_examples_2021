package lect03;

import java.util.Scanner;

public class SelectionExample3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number%2 == 0) {   // independent events
            System.out.printf("%d is divisible by 2\n", number);
        }
        if (number%3 == 0) {
            System.out.printf("%d is divisible by 3\n", number);
        }
        if (number%4 == 0) {
            System.out.printf("%d is divisible by 4\n", number);
        }
        if (number%5 == 0) {
            System.out.printf("%d is divisible by 5\n", number);
        }

    }
}
