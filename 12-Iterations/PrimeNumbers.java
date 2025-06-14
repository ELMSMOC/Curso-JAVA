import java.util.Scanner;

public class PrimeNumbers {

    static int getDataByScanner (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero y te digo si es primo");
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

    public static void main(String[] args) {
        int numPrimus = getDataByScanner();
        boolean resultado = isPrime(numPrimus);
        System.out.println(resultado);
        System.out.println("Es primo?" + resultado);
    }
}
