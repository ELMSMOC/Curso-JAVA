package Ahorcado;

import java.util.Random;
import java.util.Scanner;

public class testAhorcado {

    static String wordGenerator(){
        String[] words = {
            "Embrujada",
            "Helado",
            "Estatua",
            "Colegio",
            "Chavola",
            "Patio",
            "Arbol",
            "Pocoyo"
        };

        Random r = new Random();
        int index = r.nextInt(words.length);
        // System.out.println(words[index]);
        return words[index];
    }

    static String printHyphens(String word){
        String palabra = word;
        int count = 0;
        for (int i=0; i<word.length();i++) {
            count++;
            System.out.printf("_ ");
        }
        System.out.printf("");
        return palabra;
    }



    static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una letra");
        String letter = scanner.nextLine();
        return letter;
    }

    // static private void wordComparation(String word){
        
    // }
    
    
    public static void main(String[] args) {
        String letter = getLetter();
        while (letter.length() != 1){
        System.out.println(letter.length());
            System.out.println("Solo una letra por favor");
            letter=getLetter();
        };
        printHyphens(wordGenerator());
    }
}
