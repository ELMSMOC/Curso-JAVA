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
        String day = getWeekDay();
        switch (day.toLowerCase()) {
            case "Lunes":
                System.out.println("Monday");
                break;
            case "Martes":
                System.out.println("Tuesday");
                break;
            case "Miercoles":
                System.out.println("Wednesday");
                break;
            case "Jueves":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Viernes");
                break;
            case "Sabado":
                System.out.println("Saturday");
                break;
            case "Domingo":
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("No se que me dices");
                break;
        }
    }

}