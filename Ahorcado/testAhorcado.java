package Ahorcado;

import java.util.ArrayList;
import java.util.List;
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
        String word = words[index];
        return word;
    }
    
    public static String printHyphens(String word){
        String hyphenWord = "_".repeat(word.length());
        System.out.println(hyphenWord);
        return hyphenWord;
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
            if (letter.charAt(0) == word.charAt(j)){
                indexList.add(j);
            }
        }
        
        return indexList;
        
    }

    public static String updateWord (List<Integer> indexList, String letter, String wordMod){
        String word = wordMod;
        for (Integer integer : indexList) {
            
        }
        return word;
    }
    
    
    public static void main(String[] args) {
        String word = wordGenerator();
        printHyphens(word);
        
        System.out.println("------------------------------");
        String message = "Palabra con %s letras";
        System.out.println(message.formatted(word.length()));
        System.out.println(word);

        String letter = getLetter();
        List<Integer> indexlist = getLetterPositions(letter, word);
        for (int integer : indexlist) {
            System.out.print(integer);
        }
        printWordModified(indexlist);
        // System.out.println();
        // while (letter.length() != 1){
        //     System.out.println(letter.length());
        //     System.out.println("Solo una letra por favor");
        //     getLetter();
        // };
    }
}
