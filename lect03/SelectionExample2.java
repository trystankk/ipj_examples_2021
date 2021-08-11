package lect03;

public class SelectionExample2 {

    public static void main(String[] args) {

        String membershipType = "platinum";
        double spending = 3000;
        int pointsEarned = 0;
        double pointsRate = 0.0;

        if (membershipType.equals("gold")) {
            System.out.println("You are required to earn 500pts to retain membership");
            if (spending < 3000) {
                pointsRate = 0.03;
            } else {
                pointsRate = 0.04;
            }

        } else if (membershipType.equals("maxim")) {
            System.out.println("You are required to earn 3000pts to retain membership");
            if (spending < 5000) {
                pointsRate = 0.04;
            } else {
                pointsRate = 0.05;
            }

        } else if (membershipType.equals("platinum")) {
            System.out.println("You are required to earn 10000pts to retain membership");
            if (spending < 5000) {
                pointsRate = 0.05;
            } else if (spending < 10000) {
                pointsRate = 0.06;
            } else {
                pointsRate = 0.07;
            }

        }

        pointsEarned = (int) (pointsRate * spending);
        System.out.println("Points Earned: " + pointsEarned);


    }
}
