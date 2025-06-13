import java.util.Scanner;

public class Multiply {

    static final int COUNTER_NUM = 10;

    public static void multiplicar (){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Quieres todas las tablas? Si o No?");
        String oneOrAll = scanner2.nextLine();
        if (oneOrAll == "Si"){
           System.out.println(); 
        } 
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce un numero para tu tabla");
        int numberInput = scanner1.nextInt();
        
        scanner1.close();
        scanner2.close();

        for (int i = 1; i <= COUNTER_NUM; i++) {

                System.out.printf(*** ***,);
            }
        
        if (oneOrAll == "Si") {

        } else {
            
        }
        
        
    }

    public static void main(String[] args) {
       multiplicar();
    }
}
