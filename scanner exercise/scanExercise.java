import java.util.Scanner;

public class scanExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("escribe tu nombre");

        String name = scanner.nextLine();
        
        System.out.println("escribe tu edad");
        int age = scanner.nextInt();
        
        System.out.println("hola " + name);
        System.out.println("Tienes " + age);
        
        scanner.close();
    }
}