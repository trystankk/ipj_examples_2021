package lect02;

public class OperatorExamples2 {

    public static void main(String[] args) {
        int a = 6;
        int b = 10;

        if (a%2==1 && b%2==1) {  // if a is odd AND b is odd
            System.out.println("Both a and b are odd");
        } else if (a%2==1 || b%2 == 1) {  // if a is odd OR b is odd
            System.out.println("Only one number is odd");
        } else {  // everything else which happens to be both even
            System.out.println("Both numbers are even");
        }
    }
}
