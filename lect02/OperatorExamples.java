package lect02;

public class OperatorExamples {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 88;
        int d = 20;

        int remainder = c % b;  // 4
        System.out.println(remainder);

        System.out.println(a++);  // a will incremented after statement is executed
        System.out.println(b--);  // b will decremented after statement is executed
        System.out.println(++c);  // c will incremented before statement is executed
        System.out.println(--d);  // d will decremented before statement is executed

        System.out.printf("a=%d, b=%d, c=%d, d=%d\n", a, b, c, d);
        // a=6, b=6, c=89, d=19
        System.out.println(d++ - --b * c++ / --a);
        // 19 - 5 * 89 / 5  = 19 - 89 = -70
    }
}
