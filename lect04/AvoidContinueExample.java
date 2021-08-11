package lect04;

public class AvoidContinueExample {

    public static void main(String[] args) {

        int[] numbers = { 49, 29, 34, 56, 71, 23, 52, 10, 9, 11 };
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 != 0) {  // if number is not even
                continue;   // skip and continue with loop
            }
            count++;   // add 1 if not skipped
        }
        System.out.println("Number of even numbers: " + count);

        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 == 0) {  // if number is even
                count++;   // add 1 to count
            }
        }
        System.out.println("Redux - Number of even numbers: " + count);


    }
}
