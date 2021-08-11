package lect02;

public class StringExample {

    public static void main(String[] args) {
        String text1 = "MarShMaLloW";
        String text2 = "marshmallow";

        int length = text1.length();
        System.out.println("Length of string: " + length);

        if (text1.equals(text2)) {
            System.out.println("Both strings are the same (including casing)");
        } else if (text1.equalsIgnoreCase(text2)) {
            System.out.println("Both strings are the same (ignore case)");
        } else {
            System.out.println("Strings are different");
        }

        if (text2.startsWith("Mar")) {
            System.out.println("text2 starts with Mar");
        } else {
            System.out.println("text2 does not start with Mar");
        }

        if(text2.contains("llo")) {
            System.out.println("text2 contains llo");
        } else {
            System.out.println("text2 does not contain llo");
        }
    }
}
