package lect02;

public class ConversionExamples {

    public static void main(String[] args) {
        double x = 3.789;
        float y = 7.89f;
        int z = 10;

        double a = z;   // implicit conversion: int -> double
        // double has higher precision than int
        System.out.println(a);

        int b = (int) x;  // need to cast to integer, explicit
        // lossy conversion double -> int
        System.out.println(b);

        int c = (int) y;   // explicit cast
        // lossy conversion float -> int
        System.out.println(c);

        double d = y;  // no need to cast, implicit casting
        // assigning 32 bit number to 64 bit variable
        System.out.println(d);

        float j = (float) x; // explicit cast
        // x is 64 bits, j is 32 bits hence need to cast
        System.out.println(j);

        long m = 12345;
        float n = m;
        double p = m;
    }

}
