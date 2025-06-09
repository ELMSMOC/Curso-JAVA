import java.util.Scanner;

public class calculator {

    static int multiplicacion(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }

     static int division(int num1, int num2){
        int resultado = num1 / num2;
        return resultado;
    } 

    static int suma(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    } 

    static int resta(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }

    static void showResult(string operation, int resultado){
        System.out.println("La resultado de la %s es %s", operation, resultado );
    }

    static int getInteger (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Añade un numero");
        int num1 = scanner.nextInt();
        System.out.println("Añade otro numero");
        int num2 = scanner.nextInt();
    
        scanner.close();

    }
    public static void main(String[] args){
    }
}