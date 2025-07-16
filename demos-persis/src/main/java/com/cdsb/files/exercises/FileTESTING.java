package com.cdsb.files.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



import com.cdsb.files.MessagesFS;

public class FileTESTING {

    public static String listFiles(String root){
        StringBuilder sb = new StringBuilder();
        Path path = Path.of(root);
        String message = "No existe";

        if(Files.notExists(root)) {
            return message;
        }

        if(!Files.isDirectory(root)) {
            return "Es una carpeta";
        }

        try {
            Files.list(path).forEach((p) -> {
                char type = Files.isDirectory(p) ? 'D' : 'F';
                sb.append("[").append(type).append("] ");
                sb.append(p.getFileName()).append("\n");
            });
            return sb.toString();
        } catch (IOException e) {
            return "Error listing files" + "\n" + e.getMessage();
        }
        
    }


    public static void main(String[] args) {
        listFiles("demos-persisa");
    }

}
