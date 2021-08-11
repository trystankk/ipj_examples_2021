/**
 * @Author: Tony Stark
 * @Date: 15/07/2021
 * @Version: 1.01
 * @Description: Just a demo to Students
 *
 */

package lect03;

public class ConditionalExample {

    /**
     * Main() method
     * @param args
     */
    public static void main(String[] args) {
        int age = 28;

        // Eligible if age >= 21, Not Eligible otherwise
        String eligibilityToVote = (age >= 21) ? "Eligible" : "Not Eligible";

        System.out.println("Your eligibility to vote: " + eligibilityToVote);
    }
}
