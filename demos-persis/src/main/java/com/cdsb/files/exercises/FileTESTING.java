package com.cdsb.files.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileTESTING {

    public static String listFiles(String pathRoot){
        StringBuilder sb = new StringBuilder();
        Path path = Path.of(pathRoot);
        String[] message = {
            "Existe",
            "No es un directorio"
        };

        if(Files.exists(path)) {
            return message[0];
        }

        if(!Files.isDirectory(path)) {
            return message[1];
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

        System.out.println(listFiles("demo-persis"));
    }

}
