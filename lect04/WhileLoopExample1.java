package lect04;

public class WhileLoopExample1 {

    public static void main(String[] args) {
        //*****************************************
        //  Example 1: counted while loop
        //*****************************************
        int count = 0;  // a. priming the loop
        while (count < 5) {   // b. while (condition)
            System.out.println("Count: " + count);  // c. suite of statement(s)
            count++;   // d. update condition (e.g increase count by 1)
        }
        // program continues from here
        System.out.println("End of program");
    }
}
