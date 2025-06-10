public class Even {
    public static void main(String[] args){

        

        if (args.length == 0){
            System.out.println("Dime tu edad en la consola de comando");
        } else {
            int input = Integer.valueOf(args[0]);
            if (input % 2 == 0){
                System.out.println("es par");
            } else {
                System.out.println("es impar");
            }
        }

    }
}