package lect09;

import java.io.*;
import java.util.Scanner;

public class FileReadWriteExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // connected to the keyboard
        String filename = "blog.txt";
        File inFile;
        Scanner inputFile;

        System.out.println("Welcome to Blog!");
        System.out.println("=========================");

        // 1. Read from Input File
        inFile = new File(filename);

        try {
            inputFile = new Scanner(inFile);  // connect to the input file
            int lineNumber = 0;

            while(inputFile.hasNextLine()) {
                lineNumber++;
                System.out.printf("%3d. %s\n", lineNumber, inputFile.nextLine());
            }
            inputFile.close();  // close the Scanner

        } catch (FileNotFoundException fnfe) {
            System.out.println("File is not found. Please try another!");
        }

        // 2. Read from User Input
        System.out.println();
        System.out.println("Enter a line to append to the file: ");
        String text = input.nextLine();

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
        System.out.println("End of Blog Program!");
    }
}
