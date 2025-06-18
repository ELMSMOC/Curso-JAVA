import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class fibonaciTeacher {
    
    private static List<Integer> serie;
    private static int limit;

    private static void calcFibonacciBros (){
        int prev = 0, next = 1;
        fibonaciTeacher.serie = new ArrayList<>();
        while (prev <= fibonaciTeacher.limit){
            fibonaciTeacher.serie.add(prev);
            next = next + prev;
            prev = next - prev;
        }
    }

    private static void showFibonacci() {
        String message = "Sucesión de Fibonacci (hasta %s):\n";
        System.out.printf(message, fibonaciTeacher.limit);
        for (int item : fibonaciTeacher.serie) {
            System.out.println(item);
        }
    }

    private static void getLimit(){
        Scanner scanner = new Scanner(System.in);
        String message = "Dame un numero y te doy los fibonacci bros";
        System.out.println(message);
        fibonaciTeacher.limit = scanner.nextInt();
    }

     private static void askContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        String[] messages = {
                "¿Quieres continuar (S/N)?",
                "Gracias por todo"
        };

        while (wantContinue) {
            getLimit();
            calcFibonacciBros();
            showFibonacci();
            System.out.println(messages[0]);
            String answer = scanner.nextLine();
            if (answer.toLowerCase().equals("n") ||
                    answer.toLowerCase().equals("no")) {
                wantContinue = false;
            }
        }

        scanner.close();
        System.out.println(messages[1]);
    }

    
    public static void main(String[] args) {
        askContinue();
    }
}