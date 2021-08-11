package lect09;

import java.io.*;
import java.util.Scanner;

public class FileReadWriteCsv {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // connected to the keyboard
        String filename = "data.csv";
        File inFile;
        Scanner inputFile;

        System.out.println("Writing CSV!");
        System.out.println("=========================");

        // 1. Read from Input File
        inFile = new File(filename);

        try {
            inputFile = new Scanner(inFile);  // connect to the input file
            int lineNumber = 0;

            while(inputFile.hasNextLine()) {
                lineNumber++;
                String line = inputFile.nextLine();
                //System.out.printf("%3d. %s\n", lineNumber, line);
                String[] arrayStr = line.split(",");
                //System.out.println("Array Length " + arrayStr.length);
                String name = arrayStr[0];
                String personality = arrayStr[1];
                String ageStr = arrayStr[2];
                System.out.printf("%3d. Name: %s, Personality: %s, Age: %s years old\n", lineNumber, name, personality, ageStr);
            }
            inputFile.close();  // close the Scanner

        } catch (FileNotFoundException fnfe) {
            System.out.println("File is not found. Please try another!");
        }

        // 2. Read from User Input
        System.out.println();
        System.out.print("Name? ");
        String name = input.nextLine();
        System.out.print("Personality? ");
        String personality = input.nextLine();
        System.out.print("Age? ");
        String ageStr = input.nextLine();

        String delimiter = ",";
        String text = name + delimiter + personality + delimiter + ageStr;

        // 3. Write Out to the File (OUTPUT)
        try {
            FileWriter fileWriter = new FileWriter(filename, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.write(text + "\n");
            printWriter.flush();
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("\nLine written successfully to file!");

        } catch (IOException e) {
            System.out.println("Cannot write to file. Check your file permissions!");
        }

        System.out.println("=========================");
        System.out.println("End of CSV Program!");
    }

}
