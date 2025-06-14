import java.util.Scanner;

public class PrimesList {

    static int scanNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero por favor y te paso todos los primos");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    static int catchPrimes(){
        int num = scanNum();
        System.out.println("esto es" + num);
        for (int index = 2; index < num.length-1 ; index++) {
            // int[] items = num % i == 0 ? i = items[i]:;
        }
        return items[];
    }
    public static void main(String[] args) {
        catchPrimes();
        
    }
}
