public class Week {

    public static void main(String[] args){
        int day = Integer.valueOf(args[0]);

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
            case 7:
                System.out.println("Finde");
                break;
    
            default:
                System.out.println("No coincide");
                break;
        }
    }
}