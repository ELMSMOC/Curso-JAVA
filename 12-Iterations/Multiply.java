import java.util.Scanner;

public class Multiply {

    static final int COUNTER_NUM = 10;

    static void calculateTable (int num){
            System.out.println("La tabla del " + num);

            for (int i = 1; i <= COUNTER_NUM; i++) {
                System.out.println("""
                    %s x %s = %s
                    """.formatted( num, i, num*i));
            }
        }

    static void calculateAllTable (int num){
            for (int i = 1; i <= num; i++) {
                    calculateTable(i);
                }
    }

    public static void multiplicar (){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Quieres todas las tablas? Si o No?");
        String oneOrAll = scanner2.nextLine();
        if (oneOrAll.equalsIgnoreCase("Si")){
            System.out.println("Muerete");
           for (int i = 1; i <= COUNTER_NUM; i++) {
                calculateAllTable(COUNTER_NUM);
           }
        } else {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Introduce un numero para tu tabla");
            int numberInput = scanner1.nextInt();

            calculateTable(numberInput);
            
            scanner1.close();
        }   
        scanner2.close();
    }

    public static void main(String[] args) {
       multiplicar();
    }
}
