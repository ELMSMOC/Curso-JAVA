import java.util.Scanner;

public class calculator {

    static int multiplicacion(int num1, int num2){
        return num1 * num2;
    }

    static int division(int num1, int num2){
        return num1 / num2;
    } 

    static int suma(int num1, int num2){
        return num1 + num2;
    } 

    static int resta(int num1, int num2){
        return num1 - num2;
    } 

    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();
        
        Scanner scanner2 = new Scanner(System.in);
        int num2 = scanner2.nextInt();

        System.out.println("La multiplicacion es " + multiplicacion(num1, num2) );
        scanner1.close();
        scanner2.close();
    }
}