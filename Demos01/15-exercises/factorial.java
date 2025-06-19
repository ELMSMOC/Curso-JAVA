public class factorial {
    static long calcFactorial(long num){
        if (num < 0){
            num *= -1;
        }

        long result = 1;

        for (long i = num; i > 0; i--) {
            result *= i;
        }

        return result;
    }

    static long recursiveFactorial(long number){
        if (number == 1){
            return number;
        }
        long result = number * calcFactorial(number - 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calcFactorial(20));
       System.out.println(recursiveFactorial(5));
    }
}