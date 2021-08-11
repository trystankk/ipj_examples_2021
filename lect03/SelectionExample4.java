package lect03;

import java.util.Scanner;

public class SelectionExample4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a score: ");
        int score = input.nextInt();
        String grade = "";
        if(score >= 85 && score <= 100) {  // mutually exclusive events
            grade = "A";
        } else if (score >= 70 && score < 85) {
            grade = "B";
        } else if (score >= 50 && score < 70) {
            grade = "C";
        } else if (score >= 0 && score < 50) {
            grade = "F";
        } else {
            grade = "Undefined";
        }
        System.out.println("Grade is " + grade );
    }
}
