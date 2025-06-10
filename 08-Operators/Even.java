public class Even {

    public static void mode1(String[] args) {
        if (args.length == 0){
            System.out.println("Dime tu edad en la consola de comando");
        } else {
            int input = Integer.valueOf(args[0]);
            if (input % 2 == 0){
                System.out.printf("El numero %s es par", input);
            } else {
                System.out.printf("El numero %s es impar", input);
            }
        }
    }

    public static void mode2(String[] args) { 
        if (args.length == 0) {
            System.out.println("Tienes que añadir un entero en la línea de comandos");
            return;
        }      
        int number = Integer.valueOf(args[0]);
        if( (number % 2) == 0) {
            System.out.printf("El número %s es par", number);
        } else {
            System.out.printf("El número %s es impar", number);
        }
    }

    public static void mode3(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Tienes que añadir un entero en la línea de comandos");
            return;
        }      

        int number = Integer.valueOf(args[0]);
        String result = "impar";
        if( (number % 2) == 0) {
            result = "par";
         } 
        System.out.printf("El número %s es %s", number, result);
     
    }

    public static void mode4(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Tienes que añadir un entero en la línea de comandos");
            return;
        }      

        int number = Integer.valueOf(args[0]);
        // (condición) ? valor : valor
        String result = (number % 2) == 0 ?  "par" : "impar";
        System.out.printf("El número %s es %s", number, result);
     
    }

    public static void main(String[] args){
        mode1(args);
    }
}