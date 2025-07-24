package Libreria;

import Libreria.Book;

import java.util.List;

public class Library implements ILibrary {
    List<Book> bookList;

    public void addBook (Book book){
        bookList.add(book);
    };

    void showBookList(String word){
        List<Book> listFiltered = new List<Book>();

        for (Book book : bookList) {
            System.out.println(book);
        }
    };

    public static void main(String[] args) {
        Library lb = new Library();
        lb.addBook(new Book("Moby Dick", "Jules Verne", 1870, false));
        lb.addBook(new Book("Los tigres de Mompracem", "Emilio Salgari", 1900, false));
        lb.addBook(new Book("Papillon", "Henri Charriere", 1969, false));
        lb.addBook(new Book("Rebeldes", "Susan E. Hinton", 1967, false));
        lb.addBook(new Book("El instituto", "Stephen King", 2019, false));

        lb.showBookList("papillon");
    }
}
