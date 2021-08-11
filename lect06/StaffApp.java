package lect06;

import java.util.Scanner;

public class StaffApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAXSIZE = 5;
        final String MENU = "P - Print all Staff\nA - Add Staff\nQ - Quit\n>>> ";

        // 0. initialise data store
        Staff[] staffArray = new Staff[MAXSIZE];  // all elements are null

        char choice;
        do {
            System.out.print(MENU);
            choice = input.next().charAt(0);
            switch(choice) {
                case 'P':
                    System.out.println("Print all staff");
                    if (staffArray[0]!=null) {
                        System.out.println();
                        System.out.println(staffArray[0]);
                        System.out.println();
                    } else {
                        System.out.println("No staff");
                    }
                    break;
                case 'A':
                    System.out.println("Adding Staff");
                    staffArray[0] = addStaff();
                    break;
                case 'Q':
                    System.out.println("Leaving so soon?");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice!='Q');   //
        System.out.println("Thank you for using our system!");
    }

    public static Staff addStaff() {
        Scanner input = new Scanner(System.in);

        System.out.print("Staff Name: ");
        String name = input.nextLine();

        System.out.print("Staff ID: ");
        String staffID = input.nextLine();

        System.out.print("Salary: ");
        double salary = input.nextDouble();

        System.out.print("Years of Service: ");
        int yearsOfService = input.nextInt();

        System.out.println();
        Staff staff = new Staff(staffID, name, salary, yearsOfService);

        return staff;
    }
}
