package Ahorcado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class testAhorcado {
    String word = wordGenerator();
    int wordLength = this.word.length();
    String wordMod = printHyphens(word);

    // public testAhorcado (String word, String wordMod){
    // this.word = word;
    // this.wordMod = wordMod;
    // }

    public String wordGenerator() {
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

    String printHyphens(String word) {
        String hyphenWord = "_".repeat(word.length());
        System.out.println(hyphenWord);
        return hyphenWord;
    }

    String getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una letra");
        String letter = scanner.nextLine();
        return letter;
    }

    private List<Integer> getLetterPositions(String letter, String word) {
        List<Integer> indexList = new ArrayList<Integer>();

        for (int j = 0; j < word.length(); j++) {
            if (letter.toLowerCase().charAt(0) == word.toLowerCase().charAt(j)) {
                indexList.add(j);
            }
        }

        return indexList;

    }

    public String updateWord(List<Integer> indexList, String letter, String modWord) {
        StringBuilder updatedWord = new StringBuilder(modWord);

        for (Integer index : indexList) {
            updatedWord.setCharAt(index, letter.charAt(0));
        }
        return updatedWord.toString();

    }

    public static void main(String[] args) {
        testAhorcado ta = new testAhorcado();
        ta.wordGenerator();
        // System.out.println(ta.word);

        System.out.println("------------------------------");
        // System.out.println(ta.wordMod);

        int wordLengthh = ta.wordLength;
        String message = "Palabra con %s letras";
        System.out.println(message.formatted(wordLengthh));
        
        
        while (!ta.wordMod.equals(ta.word)) {
            String letter = ta.getLetter();
            
            List<Integer> indexlist = ta.getLetterPositions(letter, ta.word);

            ta.wordMod = ta.updateWord(indexlist, letter, ta.wordMod);
            System.out.println(ta.wordMod);    
        };
        System.out.println("Lo conseguiste");
        

        // ta.updateWord(indexlist, letter, );
        // System.out.println();
        // while (letter.length() != 1){
        // System.out.println(letter.length());
        // System.out.println("Solo una letra por favor");
        // getLetter();
        // };
    }
}
