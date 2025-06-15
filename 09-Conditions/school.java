import java.util.Scanner;

public class school {

    static int getAgeScanner (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduzca su edad");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    public static void main(String[] args) {
        int age = getAgeScanner();
        int index = 4;

        String[] messages = {
            "Kinder (de 6 años inclusive): Lunes y Miércoles de 16 a 17",
            "1stYear (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30",
            "2ndYear (de 9 a IO años inclusive): Martes y Jueves de 17:30 a 19",
            "3rdYear (de ll a 13 años inclusive): Lunes y Miércoles de 17 a 18:30",
            "Aqui no se te ha perdido nada, Largo escoria"
        };

        if (age < 7){
            index = 0;
        } else if (age < 9){
            index= 1;
        } else if (age < 11){
            index= 2;
        } else if (age < 14){
            index= 3;
        } else {
            index= 4;
        }

        int message = 
        (age < 7) ? index = 0:
        (age < 9) ? index= 1:
        (age < 7) ? index = 2:
        (age < 9) ? index= 3:4;

        System.out.println(messages[message]);
    } 
}