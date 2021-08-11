package lect04;

public class ForLoopExample1 {

    public static void main(String[] args) {
        // for (1. init; 2. condition; 4. update condition) {
        //     3. suite of statements
        // }
        for (int i = 0 ; i < 5; i ++) {
            System.out.println(i);  // print from 0 to 4
        }
        System.out.println();

        String[] superHeroes = {"Wanda", "Vision", "Loki", "Hulk", "Antman"};
        for(int i = 0; i < superHeroes.length; i++) {
            System.out.println("Name: " + superHeroes[i]);
        }
    }
}
