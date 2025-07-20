import java.util.List;

import Analyzer.Analysis;

public class App {
    public static void main(String[] args) throws Exception {
        Analysis a1 = new Analysis();
        String message = a1.getText();
        a1.getList(message).toString();

        a1.comparing(a1.getList(message));
        System.out.println(a1.comparing(a1.getList(message)));
        // String message = a1.getScan()

}
}
