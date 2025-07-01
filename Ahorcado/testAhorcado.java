package Ahorcado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class testAhorcado {
    private String word;
    public testAhorcado (String word){
        this.word = wordGenerator();
    }

    
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
    
    static int printHyphens(String word){
        for (int i=0; i<word.length();i++) {
            System.out.printf("_ ");
        }
        System.out.println("");
        return word.length();
    }
    
    
    
    static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una letra");
        String letter = scanner.nextLine();
        return letter;
    }
    
    private static List<Integer> getLetterPositions(String letter, String word){
        List<Integer> indexList = new ArrayList<Integer>();

        for (int j = 0; j < word.length(); j++) {
            
        }
        
        return indexList;
        
    }
    
    
    public static void main(String[] args) {
        testAhorcado nuevoJuego = new testAhorcado(wordGenerator());
        System.out.println();
        String message = "Palabra con %s letras";
        System.out.println(nuevoJuego.word);
        System.out.println(message.formatted(printHyphens(nuevoJuego.word)));

        String letter = getLetter();
        System.out.println(getLetterPositions(letter, nuevoJuego.word));
        
        // while (letter.length() != 1){
        //     System.out.println(letter.length());
        //     System.out.println("Solo una letra por favor");
        //     getLetter();
        // };
    }
}
