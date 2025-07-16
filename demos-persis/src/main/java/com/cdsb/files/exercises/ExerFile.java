package com.cdsb.files.exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExerFile {

    private static String getScan(String nameSurname) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su " + nameSurname);
        String word = sc.nextLine();
        return word;
    }

    static String getFullName() {
        StringBuilder sb = new StringBuilder();
        sb.append(getScan("nombre") + " ");
        sb.append(getScan("primer apellido") + " ");
        sb.append(getScan("segundo apellido") + " ");
        return sb.toString();
    }

    public static void main(String[] args) {

        File file = new File("users.txt");
        String u = getFullName();


        try (FileWriter fw = new FileWriter(file)) { // 'true' para añadir sin sobrescribir
        // if (file.getPath() == ){}
            file.createNewFile(); // se crea el archivo si no existe
            fw.write(u + "\n"); // escribe el nombre completo
            System.out.println("Usuario guardado en users.txt");
        } catch (IOException e) {
            System.out.println("Error creating " + file);
        }

    }

}
