package lect04;

import javax.swing.*;

public class GetUserInputExample {
    int number;

    public static void main(String[] args) {
        GetUserInputExample gui = new GetUserInputExample();

        gui.number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of loops to execute: "));
        gui.drawLoops();
    }

    public void drawLoops() {
        for(int i = 0; i < number; i++) {
            System.out.println("Printing " + i);
        }
    }
}
