package com.cdsb.files.exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExerFile {

    static String getScan(String nameSurname){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su " + nameSurname);
        String word = sc.nextLine();
        return word;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(getScan("nombre") + " ");
        sb.append(getScan("primer apellido") + " ");
        sb.append(getScan("segundo apellido") + " ");
        System.out.println(sb);

        File file = new File("users.txt");
        try (FileWriter fw = new FileWriter(file)){
            file.createNewFile(users.txt);
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
