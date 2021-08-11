package lect04;

public class BreakExample {

    public static void main(String[] args) {
        int[] numbers = { 49, 29, 34, 56, 71, 23, 52, 10, 9, 11 };
        int target = 111;
        int targetLocation = find(numbers, target);  // position if found, -1 otherwise

        if (targetLocation != -1) {
            System.out.printf("%d is found at position: %d\n", target, targetLocation);
        } else {
            System.out.printf("%d not found!\n", target);
        }
    }

    public static int find(int[]numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;  // return -1 if not found
    }

}
