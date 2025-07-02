package local.concept1;

import java.text.NumberFormat;
import java.util.Locale;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;
import local.exceptions.TechnicalException;

public class Factorial {

    static void showNumber(long number) {
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(nf.format(number));
    }

    private short num;

    Factorial() {
    }

    Factorial(short num){
        this.num = num;
    }

    long calcFactorial() throws BusinessException{
        return calcFactorial(num);
    }

    long calcFactorial(short num) throws BusinessException{
        if (num < 0) {
           String message = "No se puede calcular el factorial de " + num; 
           // throw new TechnicalException(message);
           throw new BusinessException(ErrorCodes.ERROR_NEGATIVE, message);
        }

        if (num > 10) {
            String message = "No se puede calcular el factorial de " + num; 
           // throw new TechnicalException(message);
           throw new BusinessException(ErrorCodes.ERROR_BIGGER_20, message);
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
        num = 22;

        try {
            long result = fact.calcFactorial(num);
            showNumber(result);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        
        System.out.println("Fin");
    }
}