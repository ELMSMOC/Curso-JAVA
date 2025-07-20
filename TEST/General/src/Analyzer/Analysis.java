package Analyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Analysis {

    private String text;

    List<Integer> intList = new ArrayList<>();

  
    public String getText() {
        return text;
    }


    public static List<String> wordList = new ArrayList<String>();

    public Analysis (){
        this.text = getScan();
        this.intList = comparing();
        this.wordList = getArrayList(text);
    }
    // Scanner 

    private String getScan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuenteme su vida");
        String message = sc.nextLine();
        return message;
    }
    
// Devuelve array de palabras
    public String[] getArrayList (String txt){
        String[] list = txt.split(" ");        
        return list;
    }

    public List<Integer> comparing(String[] list){


        for (String string : list) {
            int count = 0;
            for (String x : wordList) {
                if(string.equals(x)){
                    count++;
                }
            }
            intList.add(count);
        }
        return intList;
    }

    public void printList(List<Integer> list){
        for (int num : list) {
            System.out.println(num);
        }
    }



}
