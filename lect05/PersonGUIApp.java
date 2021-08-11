package lect05;

import javax.swing.*;

public class PersonGUIApp {

    public static void main(String[] args) {
        Person person1 = new Person("Cindy", 21, "EK1234J");  // Create a Person object person1
        String details = person1.getDetails();

        // display it in GUI environment
        JOptionPane.showMessageDialog(null, details);
    }
}
