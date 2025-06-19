import java.util.Scanner;

public class shop {

    static final double CLOTH_PACK = 20;

    static int getPacksCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el numero de camisetas o pantalones que quieras");
        int clothes = scanner.nextInt();
        return clothes;
    }
    public static void main(String[] args) {
        int clothes = getPacksCount();
        if (clothes < 5) {
            System.out.println("No vendo menos de 6");
        } else if (clothes < 10){
            System.out.println("No vendo menos de 6");
        }else if (clothes >= 10 && clothes <= 20){
            System.out.println("No vendo menos de 6");
        }else if (clothes > 20){} 
    }
}