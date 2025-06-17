import java.util.Scanner;
public class askUser {
    
    static void askUser(){
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;
        while(wantContinue) {
            System.out.println("Quieres continuar? (S/N)");
            String answer = scanner.nextLine();
            if (
                answer.toLowerCase().equals("n") ||
                answer.toLowerCase().equals("no")
                ){
                wantContinue = false;
                }
        }
        scanner.close();

        System.out.println("Que te den");
    }

    static void askUser2(){
        Scanner scanner = new Scanner(System.in);
        String answer = "S";

        while(
            !answer.toLowerCase().equals("n") &&
            !answer.toLowerCase().equals("no")
            ) {
            System.out.println("Quieres continuar? (S/N)");
            answer = scanner.nextLine();

        }

        scanner.close();
        System.out.println("Que te den");
    }

    static void ask2(){
    Scanner scanner = new Scanner(System.in);
    String answer = "S";

        while( !answer.toLowerCase().equals("n") &&
                ! answer.toLowerCase().equals("no")){

                
            System.out.println("¿Quieres continuar (S/N)?");
            answer = scanner.nextLine();
                }
            
            
        
    scanner.close();
    System.out.println("Gracias por todo");


    }
    public static void main(String[] args) {
        ask2();
    }
}
