package com.cdsb.files;

import java.io.File;

public class FileSystem1 {

    static void listFiles(String pathname){
        File file = new File(pathname);
        File[] list = file.listFiles();

        for (File fileOrFolder : list) {
            char type = fileOrFolder.isDirectory() ? 'D' : 'F';
            System.out.println(type + " " + fileOrFolder.getName());
        }
    }


    public static void main(String[] args) {
        String pathname = "demos-persis";
        pathname = "patata";
        listFiles(pathname);
    }
}
