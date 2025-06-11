import java.util.Scanner;

public class AgeGreet {

    // get age with scanner
    static int ageScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("añade tu edad");
        int age = scanner.nextInt();
        scanner.close();
        return age;
    }
    static int ageByArgs (String[] args) {
        if (args.length == 0) {
            System.out.println("Tienes que añadir un entero en la línea de comandos");
            return -1;
        }

        int age = Integer.valueOf(args[0]);
        return age;
    }

    public static void main(String[] args){
        //int age = ageScanner();
        int age = ageByArgs(args);

        if (age < 0){
            System.out.println("Has metido mal la edad cabronazo");
        } else if (age < 18){
            System.out.println("jovencillo");
        } else if (age < 33){
            System.out.println("Ya eres mayor de edad, un joven");
        } else if (age < 65){
            System.out.println("La edad perfecta");
        }
    }
}