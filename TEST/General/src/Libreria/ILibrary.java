package Libreria;

import java.util.List;
import java.util.Set;

public interface ILibrary {
    void shareBook(String word);
    void returnBook(Book book);
    Set<Book> getBookSet();
    String getScan();
    void loadRecords();
    void addBook (Book book);
}
