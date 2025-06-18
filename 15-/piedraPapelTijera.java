import java.util.Scanner;
import java.util.Random;

public class piedraPapelTijera {

    static int chooseItem (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige entre papel, piedra o tijera");
        String choosenOne = scanner.nextLine();
        int userCoordenate = 4;
        if (choosenOne.equals("Piedra")){
                userCoordenate = 0;
            } else if (choosenOne.equals("Papel")){
                userCoordenate = 1;
            } else if (choosenOne.equals("Tijera")){
                userCoordenate = 2;
            };
        scanner.close();
        return userCoordenate;
    }

    static void calcCoordenates (){
        Random r = new Random();
        int cpuChoose = r.nextInt(3);
        int userChoose = chooseItem();

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
        calcCoordenates(); 
    }
}