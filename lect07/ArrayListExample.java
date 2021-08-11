package lect07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        // An array is FIXED in size
        // An array list is DYNAMIC
        //    array list adds only objects
        //    if you want to add int, then use the Integer object wrapper
        ArrayList<String> nameList = new ArrayList<>();

        addToNameList(nameList);

        printList(nameList);

    }

    private static void printList(ArrayList<String> nameList) {
        for(int i = 0; i < nameList.size(); i++) {
            String name = nameList.get(i);
            if (name!=null) {
                System.out.printf("%2d) %s\n", i+1, name);
            }
        }
    }

    private static void addToNameList(ArrayList<String> nameList) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any name (Empty string to exit) : ");
        String name = input.nextLine().trim();  // strip white spaces

        while(!name.equals("")) { // while name is not an empty space
            nameList.add(name);   // add name to name list (duplicates too!)
            System.out.print("Enter any name (Empty string to exit) : ");
            name = input.nextLine().trim();  // strip white spaces
        }
    }
}
