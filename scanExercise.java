import java.util.Scanner;

public class scanExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("escribe tu nombre");
        
        String nombre = scanner.nextLine();

        System.out.println("hola " + nombre);
        scanner.close();
    }
}