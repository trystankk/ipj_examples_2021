package lect03;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        // 0 property: 0 additional buyer stamp duty (ABSD)
        // 1 property: 10 percent
        // 2 properties: 15 percent
        // 3 or 4 properties: 20 percent
        // 5 properties onward: 35 percent
        Scanner input = new Scanner(System.in);

        double taxRate = 0;
        System.out.print("Enter number of properties you currently own: ");
        int numOfProperties = input.nextInt();
        System.out.print("Purchase price of your dream property? $");
        double purchasePrice = input.nextDouble();

        switch(numOfProperties) {
            case 0:
                taxRate = 0;
                break;
            case 1:
                taxRate = 0.1;
                break;
            case 2:
                taxRate = 0.15;
                break;
            case 3:   // 3 and 4 will mean 20% tax rate applied
            case 4:
                taxRate = 0.2;
                break;
            default:
                taxRate = 0.35;
        }
        // switch statement
        // determine the taxRate

        double tax = taxRate * purchasePrice;
        System.out.printf("Tax to be paid for property of value $%,.0f ---->>> $%,.2f\n", purchasePrice, tax);
    }
}
