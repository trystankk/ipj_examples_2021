package lect07;

public class ArrayExample2 {

    public static void main(String[] args) {

        int result = sum(4, 5, 10);
        System.out.println(result);
        result = sum(10, 20, 3, 4, 19, 21);
        System.out.println(result);

    }

    private static int sum(int... numbers) {
        int total = 0;
        for(int i = 0; i < numbers.length; i++) {
            total+= numbers[i];
        }
        return total;
    }
}
