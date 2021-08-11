package lect02;

public class UnnecessaryCode {

    public static void main(String[] args) {
        double score = 90;
        char grade = 'Z';
        if (score >= 90) {
            grade = 'A';
        } else if (score >=80 && score < 90) {
            grade = 'B';
        } else if (score >=70 && score < 80) {
            grade = 'C';
        }

        System.out.println(grade);
    }
}
