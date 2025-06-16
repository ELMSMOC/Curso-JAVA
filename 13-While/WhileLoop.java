import java.util.Random;

public class WhileLoop {

    static void whileSample(){
        boolean sentinel = true;
        
        while (sentinel) {
            Random randomCreator = new Random();
            int number = randomCreator.nextInt(9);
            if (number % 2 == 0){
                continue;
            }
            System.err.println("Numnero " + number);
            if (number == 7){
                sentinel= false;
            }
        }
    }

    static void forSample(){
        for (int i = 0; i >= 0; i++) {
            Random randomCreator = new Random();
            int number = randomCreator.nextInt(9);
            if (number % 2 == 0){
                continue;
            }
            System.err.println("Numnero " + number);
            if (number == 7){
                break;
            }
        }
    }

    static void forSample2(){
        int number = 0;
        
        for (int i = 0; number != 7; i++) {
            Random randomCreator = new Random();
            number = randomCreator.nextInt(9);
            if (number % 2 == 0){
                continue;
            }
            System.err.println("Numnero " + number);
            if (number == 7){
                break;
            }
        }
    }

    static void whileSampleWithCounter(){
        boolean sentinel = true;
        int counter = 0;
        
        while (sentinel) {
            counter++;
            Random randomCreator = new Random();
            int number = randomCreator.nextInt(9);
            if (number % 2 == 0){
                continue;
            }
            System.err.printf("Numnero %s = %s", counter, number);
            System.out.println("");
            if (number == 7){
                break;
            }
        }
    }
   public static void main(String[] args) {
    String example;
    String[] examples;

        whileSampleWithCounter();
   } 
}
