import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimesList {

    static int getScanNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero por favor y te paso todos los primos");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    private static void showPrime (int num){
        for (int i = 0; i < num; i++) {
            if (PrimeNumbers.isPrime(i)){
                System.out.println("El " + i);
            }
        }
    }

    private static List<Integer> catchPrimes(int numberInput){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int index = 2; index < numberInput; index++) {
            if (PrimeNumbers.isPrime(index)){
                numbers.add(index);
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int numberInput = getScanNum();
        List<Integer> numbers = catchPrimes(numberInput);
        for (int number : numbers) {
            System.out.println("El " + number);
        }
    }
}
