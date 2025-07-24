import java.util.List;

import Analyzer.Analysis;
import Libreria.Book;
import Libreria.ILibrary;
import Libreria.Library;

public class App {
    public static void main(String[] args) throws Exception {
        // Analysis a1 = new Analysis();
        // String message = a1.getText();
        // String[] ar = a1.getArrayList(message);

        // a1.comparing(ar);
        // System.out.println(a1.comparing(ar));
        // String message = a1.getScan()
        

        // LIBRARY==========================
        Library lb = new Library();
        lb.addBook(new Book("Moby Dick", "Jules Verne", 1870, false));
        lb.addBook(new Book("Los tigres de Mompracem", "Emilio Salgari", 1900, false));
        lb.addBook(new Book("Papillon", "Henri Charriere", 1969, false));
        lb.addBook(new Book("Rebeldes", "Susan E. Hinton", 1967, false));
        lb.addBook(new Book("El instituto", "Stephen King", 2019, false));

        lb.showBookList("papillon");

}
}
