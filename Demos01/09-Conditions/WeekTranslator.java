import java.util.Scanner;

public class WeekTranslator {

    static String getWeekDay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un dia de la semana y lo traduzco al ingles");
        String inputDay = scanner.nextLine();
        scanner.close();
        return inputDay;
    }

    public static void main(String[] args) {
        String inputDay = getWeekDay();

        switch (inputDay.toLowerCase()) {
            case "lunes":
                System.out.println("Monday");
                break;
            case "martes":
                System.out.println("Tuesday");
                break;
            case "miércoles":
            case "miercoles":
                System.out.println("Wednesday");
                break;
            case "jueves":
                System.out.println("Thursday");
                break;
            case "viernes":
                System.out.println("Friday");
                break;
            case "sábado":
            case "sabado":
                System.out.println("Saturday");
                break;
            case "domingo":
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("No se que me dices");
                break;
        }
    }

}