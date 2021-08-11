package lect07;

public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = {40, 20, 10, 50, 90, 80, 60};   // elements are default to 0

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("item[" + i + "]: " + numbers[i]);
        }

        String[] names = {"Jojo", "Vicky", "Jackie"};
        for (String name: names) {
            System.out.println(name);
        }
        names[0] = "June";
        System.out.println();
        for (String name: names) {
            System.out.println(name);
        }

    }
}
