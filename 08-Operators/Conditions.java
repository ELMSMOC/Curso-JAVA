public class Conditions {
    
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("Dime tu edad en la consola de comando");
        } else {
            int age = Integer.valueOf(args[0]);

            System.out.println("Tu edad es " + age);
        }
        
    }
}