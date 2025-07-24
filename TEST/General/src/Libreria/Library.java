package Libreria;

import Libreria.Book;

import java.util.List;

public class Library implements ILibrary {
    List<Book> bookList;

    void addBook (Book book){
        bookList.add(book);
    };

    public static void main(String[] args) {
        
    }
}
