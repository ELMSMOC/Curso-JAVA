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

    public String getScan(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
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

    public Book chooseBook(Set<Book> setList) {
        for (Book book : setList) {
            System.out.println(book.toString());
        }
        String title = getScan("Escribe un titulo mas especifico entre estos");
        Set<Book> sb = compareInput(title);
        
        if (sb.size() == 1) {
            Book book = sb.iterator().next();
            System.out.println(book.toString());
            return book;
        }
        return null;
    }

    public Set<Book> getBookSet() {
        Set<Book> resultSet = new HashSet<>();
        boolean isFinded = false;

        do {
            String word = getScan("Escriba un titulo que quiera leer");
            resultSet = compareInput(word);

            if (resultSet.isEmpty()) {
                System.err.println("No hay elementos parecidos, intentalo de nuevo.");
                printSetBook();
            } else if (resultSet.size() == 1) {
                Book book = resultSet.iterator().next();
                System.out.println("Perfecto nos quedamos con \n %s".formatted(book));
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
    public void shareBook(Book book) {
        book.setShared(true);
    }

    @Override
    public void returnBook(Book book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnBook'");
    }

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


}
