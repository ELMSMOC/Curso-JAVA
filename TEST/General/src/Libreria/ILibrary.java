package Libreria;

import java.util.List;
import java.util.Set;

public interface ILibrary {
    void shareBook(Book word);
    void returnBook(Book book);
    Set<Book> getBookSet();
    String getScan(String message);
    void loadRecords();
    void addBook (Book book);
    Book chooseBook(Set<Book> setList);
}
