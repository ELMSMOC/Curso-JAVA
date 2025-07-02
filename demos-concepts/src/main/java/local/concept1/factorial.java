package local.concept1;

import java.text.NumberFormat;

public class Factorial {
    private short num;

    Factorial(short num){
        this.num = num;
    }

    long calcFactorial(){
        return calcFactorial();
    }

    long calcFactorial(long num){
        if (num < 0){
            throw new IndexOutOfBoundsException();
        }

        long result = 1;

        for (long i = num; i > 0; i--) {
            result *= i;
        }

        return result;
    }

    void show (){
        // NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        
    }


    public static void main(String[] args) {
        Factorial fact = new Factorial();
        short num = 10;
        num = -5;
        try {

        } catch (Exception e){}
        
        System.out.println(fact.calcFactorial(num));
    }
}