package lect07;

public class ArraySortExample {

    public static void main(String[] args) {
        int[] numbers = {
                38, 50, 49, 24, 96, 40
        };
        printArray(numbers);  /// before Sorting
        sort(numbers);
        printArray(numbers);  /// After Sorting

    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
                //printArray(numbers); // to see the sorting sequence
            }
        }
    }

}
