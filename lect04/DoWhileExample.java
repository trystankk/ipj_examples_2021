package lect04;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String menu = "A. Poke friend\n";
        menu += "B. Cuddle friend\n";  // menu = menu + "B..... \n";
        menu += "C. Take Wefie\n";
        menu += "Q. Quit\n";
        menu += ">>> ";
        char option;

        do {
            System.out.print(menu);
            option = input.next().toUpperCase().charAt(0);  // read in a character
            switch (option) {
                case 'A':
                    System.out.println("Friend says Ouch!");
                    break;
                case 'B':
                    System.out.println("Friend looks at you with gratitude");
                    break;
                case 'C':
                    System.out.println("Friend covers face");
                    break;
                case 'Q':
                    System.out.println("See you again soon!");
                    break;
                default:
                    System.out.println("Wrong input!");
            }
        } while (option != 'Q');
    }
}
