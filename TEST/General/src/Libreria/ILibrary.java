package Libreria;

import java.util.List;
import java.util.Set;

public interface ILibrary {
    void shareBook(String word);
    void returnBook(Book book);
    Set<Book> getBookList();
    String getScan();
}
