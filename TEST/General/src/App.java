import java.util.List;

import Analyzer.Analysis;

public class App {
    public static void main(String[] args) throws Exception {
        Analysis a1 = new Analysis();
        String message = a1.getText();
        String[] ar = a1.getArrayList(message);

        a1.comparing(ar);
        System.out.println(a1.comparing(ar));
        // String message = a1.getScan()

}
}
