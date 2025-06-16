import java.util.Scanner;

public class PrimeNumbers {

    static int getDataByScanner (String message){
        Scanner scanner = new Scanner(System.in);
        String text = message;
        System.out.println(text);
        int numberInput = scanner.nextInt();
        scanner.close();
        return numberInput;
    }

    static boolean isPrime(int num){
        for (int i = 2; i < (num - 1); i++){
            if (num % i != 0){
                return true;
            }
        }
        return false;
    }

    static void writeResult(int num){
        String resultado = isPrime(num) ? "Si es primo" : "No lo es";
        System.out.println("Es primo?" + resultado);
    }

    public static void main(String[] args) {
        int numPrimus = getDataByScanner("Dime un numero y te digo si es primo");
        writeResult(numPrimus);
        // writeResult(getDataByScanner());
    }
}
