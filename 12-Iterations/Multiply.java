import java.util.Scanner;

public class Multiply {

    static final int COUNTER_NUM = 10;

    public static void multiplicar (){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce un numero para tu tabla");
        int numberInput = scanner1.nextInt();
        scanner1.close();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Quieres todas las tablas? Si o No?");
        String oneOrAll = scanner2.nextLine();
        scanner2.close();

        for (int i = 1; i < (COUNTER_NUM + 1); i++) {
                int result= i* numberInput;
                System.out.println(i + " * numero = " + result);
            }
        
        if (oneOrAll == "Si") {

        } else {
            
        }
        
        
    }

    public static void main(String[] args) {
       multiplicar();
    }
}
