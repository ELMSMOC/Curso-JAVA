import java.util.Scanner;
import java.util.Random;

public class piedraPapelTijera {

    private static int chooseItem (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige entre papel, piedra o tijera");
        String choosenOne = scanner.nextLine();
        int userCoordenate = 4;
        if (choosenOne.equals("Piedra".toLowerCase())){
                userCoordenate = 0;
            } else if (choosenOne.equals("Papel".toLowerCase())){
                userCoordenate = 1;
            } else if (choosenOne.equals("Tijera".toLowerCase())){
                userCoordenate = 2;
            };
        scanner.close();
        return userCoordenate;
    }

    private static void calcCoordenates (){
        Random r = new Random();
        int cpuChoose = r.nextInt(3);
        int userChoose = chooseItem();
        String message = "La computadora eligio %s";
        String cpuChooseText = (cpuChoose == 0) ? "piedra":  
        (cpuChoose == 1) ? "papel": "tijera";
        System.out.println(message.formatted(cpuChooseText));

        int[][] matrix = {{0,1,2},{2,0,1},{1,2,0}};

        if (matrix[cpuChoose][userChoose] == 0){
            System.out.println("Empate");
        } else if (matrix[cpuChoose][userChoose] == 1){
            System.out.println("Tu ganas");
        } else if (matrix[cpuChoose][userChoose] == 2){
            System.out.println("Tu Pierdes");
        }
    }
    
    public static void main(String[] args){
            System.out.println("hola");
            calcCoordenates();

    }
}

//-------------------------------------------- Teacher Solution

// public class PiPaTx {

//     private static final byte STONE = 1;
//     private static final byte PAPER = 2;
//     private static final byte SCISSORS = 3;

//     private static final String[] dices = {    
//         "None", "PIEDRA", "PAPEL", "TIJERA"
//     };


//     private static final byte EQUALS = 0;
//     private static final byte USER = 1;
//     private static final byte MACHINE = 2;


//     private static final String[] diceResult = {    
//         "Empate", "Has ganado", "Ha ganado la máquina"
//     };


//     private static final byte[][] RESULTS = {
//         {EQUALS,   USER,     MACHINE},
//         {MACHINE,  EQUALS,   USER},
//         {USER,     MACHINE, EQUALS},
//     }; 


//     private static byte userDice;
//     private static byte machineDice;

//     private static void askUserDice() {
//         String message = "Indica tu tirada: (PI, PA, TI)";
//         Scanner scanner = new Scanner(System.in);
//         userDice = 0;
//         while (userDice == 0) {
//             System.out.println(message);
//             String answer = scanner.nextLine();
//             switch (answer.toUpperCase()) {
//                 case "PI":
//                     userDice = STONE;
//                     break;
//                 case "PA":
//                     userDice = PAPER;
//                     break;
//                 case "TI":
//                     userDice = SCISSORS;
//                     break;
//             }
//         }
//     }

//     private static void generateMachineDice() {
//         Random random = new Random();
//         machineDice = (byte)random.nextInt(1,3);
//     }

//     private static void showResult() {
//         System.out.println("Jugada de la máquina " + dices[machineDice]);
//         System.out.println("Tu jugada " + dices[userDice]);

//         byte winner = RESULTS[machineDice-1][userDice-1];
//         System.out.println("Resultado " + diceResult[winner]);
//     } 

//     private static void askContinue() {
//         Scanner scanner = new Scanner(System.in);
//         boolean wantContinue = true;

//         String[] messages = {
//                 "¿Quieres continuar (S/N)?",
//                 "Gracias por todo"
//         };

//         while (wantContinue) {
//             askUserDice();
//             generateMachineDice();
//             showResult();
          
//             System.out.println(messages[0]);
//             String answer = scanner.nextLine();
//             if (answer.toLowerCase().equals("n") ||
//                     answer.toLowerCase().equals("no")) {
//                 wantContinue = false;
//             }
//         }

//         scanner.close();
//         System.out.println(messages[1]);
//     }

//     public static void main(String[] args) {
//         askContinue();
//     }
// }