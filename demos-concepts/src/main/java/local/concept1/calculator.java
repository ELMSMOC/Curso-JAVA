package local.concept1;

import java.util.Scanner;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;

public class calculator {

    private int num1;

    public void setNum1(String message) {
        this.num1 = getInteger(message);
    }

    private int num2;

    public void setNum2(String message) {
        this.num2 = getInteger(message);
    }
    
    private int getInteger (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int num = scanner.nextInt();
        // scanner.close(); No se cierra, no deberia para cada vez que se llame al metodo
        return num;
    }
    
    int add(){
        int result = num1 + num2;
        return result;
    } 
    
    int substract(){
        int result = num1 - num2;
        return result;
    }

    int multiply(){
        int result = num1 * num2;
        return result;
    }

     int divide() throws BusinessException {
        try {
            int result = num1 / num2;
            return result;
        } catch (ArithmeticException e){
            throw new BusinessException(
                ErrorCodes.ERROR_ZERO, "Divide por 0", e);
        }
    }

    int restDivision () {
        int result = num1 % num2;
        return result;
    }
    
    void showResult(String operation, int result){
        System.out.printf("El resultado de la %s es %s", operation, result );
        System.out.println("");
    }
    
    void showAllResults() throws BusinessException{
        System.out.printf("Operaciones con %s y %s", num1, num2 );
        showResult("suma", add());
        showResult("resta", substract());
        showResult("division", divide());
        showResult("multiplicacion", multiply());
        showResult("resto", restDivision());
    }

    
    public static void main(String[] args){

        calculator calc = new calculator();

        calc.setNum1("Dame un int");
        calc.setNum2("Dame otro int");
        
        try {
            calc.showAllResults();
        } catch (BusinessException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
        }
    }
}