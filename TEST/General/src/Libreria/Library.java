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

    public String getScan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un titulo que quiera leer");
        String title = sc.nextLine();
        return title;
    }

    private Set<Book> compareInput(String wording) {
        Set<Book> resultSet = new HashSet<>();
        for (Book book : bookList) {
            if (book.name.toLowerCase().contains(wording.toLowerCase())) {
                resultSet.add(book);
            }
        }

        return resultSet;

    }

    public Set<Book> getBookSet() {
        Set<Book> resultSet = new HashSet<>();
        boolean isFinded = false;

        do {
            String word = getScan();
            resultSet = compareInput(word);

            if (resultSet.isEmpty()) {
                System.err.println("No hay elementos parecidos, intentalo de nuevo.");
            } else {
                isFinded = true;
            }

        } while (!isFinded);

        return resultSet;
    }

    public void printAvailableBookList() {
        for (Book book : bookList) {
            if (!book.isShared()) {
                System.out.println(book.toString());
            }
        }
    }

    public void printSetBook() {
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

    // @Override
    // public Book chooseBook(Set<Book> setList) {
    // System.out.println(setList.toString());
    // }

    @Override
    public void addBook(Book book) {
        bookList.add(book);
        if (!bookSet.contains(book)) {
            bookSet.add(book);
        }
    }

    @Override
    public void loadRecords() {
        addBook(new Book("Moby Dick", "Jules Verne", 1870, false));
        addBook(new Book("Los tigres de Mompracem", "Emilio Salgari", 1900, false));
        addBook(new Book("Los tigres de Mompracem", "Emilio Salgari", 1900, false));
        addBook(new Book("Los tigres de Mompracem", "Emilio Salgari", 1900, false));
        addBook(new Book("Los tigres de Mompracem", "Emilio Salgari", 1900, false));
        addBook(new Book("Papillon", "Henri Charriere", 1969, false));
        addBook(new Book("Rebeldes", "Susan E. Hinton", 1967, false));
        addBook(new Book("El instituto", "Stephen King", 2019, false));
        addBook(new Book("El prisionero de Azkaban", "L. K. Rouly", 2004, false));
        addBook(new Book("El caliz de fuego", "L. K. Rouly", 2006, false));

    }

    @Override
    public Book chooseBook(Set<Book> setList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseBook'");
    }

}
