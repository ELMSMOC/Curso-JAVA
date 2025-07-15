package com.cdsb.files;

import java.io.File;
import java.util.Arrays;

public class FileSystem1 {

    static void listFiles(String pathname){
        File file = new File(pathname);
        String[] list = file.list();

        for (String item : list) {
            char type = getType(pathname + "/" + item);
            System.out.println(type + " " + item);
        }
    }

    static char getType(String pathname){
        File file = new File(pathname);
        return file.isDirectory() ? 'D': 'F';
    }

    public static void main(String[] args) {
        String pathname = "demos-persis";
    }
}
