import java.util.Scanner;

public class MatrixUser {

    static String[][] getData (){
        String[][] animalMatrix = new  String [3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < animalMatrix.length; i++) {
            for (int j = 0; j < animalMatrix[0].length; j++) {
                System.out.println("Dime un animal");
                animalMatrix[i][j] = scanner.nextLine();
            }
        }
        
        scanner.close();
        return animalMatrix;
    }

    static void showData (String[][] data){
        for (String[] row : data) {
            for (String text : row) {
                System.out.println(text);
            }
        }
    }

    // Misma funcion duplicada con distinto tipo de parametro
    static void showData (String[] data){
        for (String[] row : data) {
            for (String text : row) {
                System.out.println(text);
            }
        }
    }

    static  void getAnimals(){
        String[][] animals = new  String [3][3];

        String[] messages = {
            "Dime 3 domesticos",
            "Dime 3 salvajes",
            "Dime 3 no mamiferos"
        };
    }

    static String[] selectRamdoms(string[][] data){
        String[] selectedAnimals = new String[data.length];
        Ramdom r = new Ramdom();
        for (int i = 0; i < selectedAnimals.length; i++) {
             selectedAnimals[i] = data[i]
        }
    }
    
    public static void main(String[] args) {
        String[][] animals = getAnimals();
        
        showData(animals);
        String[] selectedAnimals = selectRamdoms(animals);
    }
}
