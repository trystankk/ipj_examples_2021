package lect06;

public class DemoApp {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        double a = 25.5;
        double b = 75.5;

        int result = sum(x, y);

        double result2 = sum(a, b);

        double result3 = sum(x, b);
    }

    public static double sum(double a, double b) {  // sum(double, double)
        return a + b;
    }

    public static int sum(int x, int y) { // sum(int, int)
        return x + y;
    }

    public static double sum(int a, double b) { // sum(int, double)
        return a + b;
    }

    public static double sum(double a, int b) {  // sum(double, int)
        return a + b;
    }

    public static double sum(int a, double b, int c) {
        return a + b + c;
    }
}
