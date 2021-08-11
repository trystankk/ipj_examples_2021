package lect04;

import java.util.Scanner;
import java.util.Random;

public class WhileLoopExample3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int secretAnswer = random.nextInt(6) + 5; // use random number generator to generate this number

        // 1. prime the loop
        System.out.print("Guess a number (1 to 10): ");
        int guess = input.nextInt();

        while(guess != secretAnswer) { // 2. while condition
            System.out.println("Wrong answer!");  // 3. suite
            System.out.println("Correct answer is: " + secretAnswer);
            System.out.println("Try again!");     //    of statements

            secretAnswer = random.nextInt(10) + 1; // this is hardcoded for now, usually it is random number
            System.out.print("Guess a number (1 to 10): "); // 4. update condition
            guess = input.nextInt();
        }

        System.out.println("You win!");
    }
}
