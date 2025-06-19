import java.util.Scanner;
public class fibonaci {

    static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero entero y te digo todos los anterios en la serie fibonaci");
        int input = scanner.nextInt();
        scanner.close();
        return input;
    }

    static int sum(int num1, int num2){
        return num1 + num2;
    }

    static void printNums(int num){
        int prev = 0;
        int next = 1;
   
        System.out.println(prev);
        System.out.println(next);

        while (num > sum(prev, next)){
            System.out.println(sum(prev, next));
            next = prev + next;
            prev = next - prev;
        }
    }

    
    public static void main(String[] args){
        int entrada = getNumber();
        printNums(entrada);
    }
}