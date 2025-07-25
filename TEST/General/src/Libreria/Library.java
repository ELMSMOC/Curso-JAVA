package Libreria;

import Libreria.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Library implements ILibrary {
    static List<Book> bookList = new ArrayList<Book>();
    static Set<Book> bookSet = new HashSet<>();
    
    public void addBook (Book book){
        bookList.add(book);
        if(!bookSet.contains(book)){
            bookSet.add(book);
        }
    }

    public String getScan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un titulo que quiera leer");
        String title = sc.nextLine();
        return title;
    }
    
    public Set<Book> getBookList(){
        boolean isFinded = false;
        Set<Book> resultSet = new HashSet<>();
        do {
            String wording = getScan();
            for (Book book : bookList) {
                if (book.name.toLowerCase().contains(wording.toLowerCase())){
                    resultSet.add(book);
                }
            }
            
            if (resultSet.isEmpty()) {
                System.err.println("No hay elementos parecidos");
                    isFinded = false;
                } else {
                    isFinded = true;
                }
                
            } while (!isFinded); 
            return resultSet;
    }

    public void printAvailableBookList(){
        for (Book book : bookList) {
            if (!book.isShared()) {
                System.out.println(book.toString());
            }
        }
    }

    public void printSetBook(){
        for (Book book : bookSet) {
            if (!book.isShared()) {
                System.out.println(book.toString());
            }
        }
    }

    @Override
    public void shareBook(String word) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shareBook'");
    }

    @Override
    public void returnBook(Book book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnBook'");
    }


}

