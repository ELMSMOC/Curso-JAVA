import java.util.Scanner;
public class fibonacciParams {

    static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero entero y te digo todos los anterios en la serie fibonaci");
        int input = scanner.nextInt();
        scanner.close();
        return input;
    }
    
    public static void main(String[] args){
        int entrada = getNumber();
        printNums(entrada);
    }
}