public class Even {

    public static void mode1 {
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

     public static void mode2 {

    }
    public static void main(String[] args){

        mode1(args);
        mode1(args);
    }
}