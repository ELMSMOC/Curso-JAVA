import java.util.Scanner;

public class PrimeNumbers {

    static int getDataByScanner (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero y te digo si es primo");
        int numberInput = scanner.nextInt();
        scanner.close();
        return numberInput;
    }

    static boolean isPrime(int numberInput){
        for (int i = 1; i < (numberInput - 1); i++){
            numberInput % i == 0 ? return false : return true;
        }
    }
    public static void main(String[] args) {
        isPrime(3);
    }
}
