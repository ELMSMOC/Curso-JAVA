package local.concept1;

import java.util.Scanner;

public class calculator {

    private int num1;

    public void setNum1(String message) {
        this.num1 = getInteger(message);
    }

    private int num2;

    public void setNum2(String message) {
        this.num2 = getInteger(message);
    }

    int add(){
        int result = num1 + num2;
        return result;
    } 
    
    int sustract(){
        int result = num1 - num2;
        return result;
    }

    int multiply(){
        int result = num1 * num2;
        return result;
    }

     int divide(){
        if (num2 == 0){
            throw new exceptions}
        int result = num1 / num2;
        return result;
    }

    int restDivision () {
        int result = num1 % num2;
        return result;
    }
    
    void showResult(String operation, int result){
        System.out.printf("El resultado de la %s es %s", operation, result );
        System.out.println("");
    }
    
    void showAllResult(String operation, int result){
        System.out.printf("El resultado de la %s es %s", operation, result );
        System.out.println("");
        System.out.printf("Operaciones con %s y %s\n", num1, num2);
    }

    private int getInteger (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int num = scanner.nextInt();
        // scanner.close(); No se cierra, no deberia para cada vez que se llame al metodo
        return num;
    }
    
    public static void main(String[] args){

        calculator calc = new calculator();

        calc.setNum1("Dame un int");
        calc.setNum2("Dame otro int");


        calc.showResult("suma", calc.add());
        calc.showResult("resta", calc.sustract());
        calc.showResult("producto", calc.multiply());
        calc.showResult("división", calc.divide());
        calc.showResult("resto", calc.restDivision());
    }
}