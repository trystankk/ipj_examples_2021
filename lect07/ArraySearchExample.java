package lect07;

public class ArraySearchExample {

    public static void main(String[] args) {
        int[] numbers = {
            38, 24, 96, 40, 50, 19, 13, 42, 30, 50, 39, 47
        };
        int target = 19;
        //int location = -1;   // -1 means not found
        int location = search(numbers, target); // search will return index
        // search numbers for target to return index

        if (location!= -1) {
            System.out.printf("Target %d is found at position %d.\n", target, location);
        }
        else {
            System.out.println("Target is not found in the container");
        }
    }

    public static int search(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {  // found target
                return i;  // return location
            }
        }
        return -1;   // return -1 if not found
    }

}
