package lect04;

import java.util.Scanner;

public class WhileLoopExample2 {
    public static void main(String[] args) {
        //******************************************
        // Example 2: Sentinel controlled while loop
        //******************************************
        Scanner input = new Scanner(System.in);

        // 1. prime the loop
        System.out.print("Enter a number (-1 to exit): ");
        int number = input.nextInt();
        int numOfPositiveNumbers = 0;
        while (number!=-1) {  // 2. while (condition)
            // 3. suite of statements
            if (number >= 0) {
                numOfPositiveNumbers++;  // keep track of +ve numbers
            }
            // 4. update the condition
            System.out.print("Enter a number (-1 to exit): ");
            number = input.nextInt();
        }

        System.out.printf("There are %d positive numbers.\n", numOfPositiveNumbers);
    }
}
