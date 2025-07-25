
import java.util.Set;

import Libreria.Book;
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
        lb.loadRecords();
        
        lb.printSetBook();
        Set<Book> sb = lb.getBookSet();
        // System.out.println(sb.toString());
        
        

    }
}
