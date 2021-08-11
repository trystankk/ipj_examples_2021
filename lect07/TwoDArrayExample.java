package lect07;

public class TwoDArrayExample {

    public static void main(String[] args) {
        int[][] twoDArray = new int[4][6];  // 3 rows , 4 columns

        printTwoDArray(twoDArray);

        System.out.println();

        int[][] twoDArray2 = { {77, 22, 10}, {33, 44, 5}, {10, 11, 8}, {2, 3, 4}};

        printTwoDArray(twoDArray2);

    }

    public static void printTwoDArray(int[][] twoDArray) {
        for (int row = 0; row < twoDArray.length; row++) {
            for (int column = 0; column < twoDArray[row].length; column++) {
                System.out.printf("%3d ", twoDArray[row][column]);
            }  // end of inner for
            System.out.println();  // print a new line after all columns printed
        }  // end of outer for
    }
}
