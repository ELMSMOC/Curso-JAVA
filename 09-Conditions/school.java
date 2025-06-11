import java.util.Scanner;

public class school {

    static int scannerAge(){
        Scanner scanner = new Scanner(System.in);
        System.err.println("Escribe tu edad");
        int age = scanner.nextInt();
        scanner.close();
        return age;
    }

    public static void main(String[] args){
        String[] messages = {
            "Kinder",
            "1st Year",
            "2nd Year",
            "3rd Year",
            "No hay clases para usted"            
        };

        // int index = 4;
        int age = scannerAge();
        
        
        // if (age <= 6) {
        //     index = 0;
        // } else if (age <= 8) {
        //     index = 1;
        // } else if (age <= 10) {
        //     index = 2;
        // } else if (age <= 13) {
        //     index = 3;
        // }

        int index = (age <= 6) ? 0 : 
                    (age <= 8) ? 1 : 
                    (age <= 10) ? 2 : 
                    (age <= 13) ? 3 : 4;

        System.out.println(messages[index]);

    }    
}