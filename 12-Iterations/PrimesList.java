import java.util.ArrayList;
import java.util.List;

public class PrimesList {

    private static void showPrime (int num){
        for (int i = 0; i < num; i++) {
            if (PrimeNumbers.isPrime(i)){
                System.out.println("El " + i);
            }
        }
    }

    private static List<Integer> catchPrimes(int numberInput){
        List<Integer> numbers = new ArrayList<>();
        for (int index = 2; index < numberInput; index++) {
            if (PrimeNumbers.isPrime(index)){
                numbers.add(index);
            }
        }
        return numbers;
    }

    static void showPrimeList(List<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    public static void main(String[] args) {
        int numberInput = PrimeNumbers.getDataByScanner("Dame un numero por favor y te paso todos los primos");
        List<Integer> numbers = catchPrimes(numberInput);
        showPrimeList(numbers);
    }
}
