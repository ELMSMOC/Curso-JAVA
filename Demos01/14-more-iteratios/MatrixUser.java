// Le pedimos al usuario 9 animales y los guardamos como matriz de 3x3
// Le presentamos los nombres que nos ha dado.  

import java.util.Random;
import java.util.Scanner;

public class MatrixUser {

    static String[][] getData() {
        String[][] animals = new String[3][3]; 
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[0].length; j++) {
                System.out.printf("Dime el animal %s\n", j+1);
                animals[i][j] = scanner.nextLine();
            }     
        }
        return animals;
    }

    static void showInfo(String[][] data){
        System.out.println("");
        System.out.println("Aqui tienes tus animales");
        for (String[] row : data) {
            for (String animal : row) {
                System.out.println(animal);
            }
        }
    }

    // Misma funcion duplicada con distinto tipo de parametro
    static void showData (String[] data){
        for (String text : data) {
            System.out.println(text);
        }
    }

    static String[][] getAnimals(){
        String[][] animals = new  String [3][3];
        String[] animalKind = {
            "Domestico",
            "Salvaje",
            "Reptil"
        };

        String[] messages = {
            "Dime 3 domesticos",
            "Dime 3 salvajes",
            "Dime 3 no mamiferos"
        };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < animals.length; i++) {
            System.out.println(messages[i]);
            
            for (int j = 0; j < animals[0].length; j++) {
                System.out.printf("Dime el animal %s %s\n", animalKind[i], j+1);
                animals[i][j]= scanner.nextLine();
            }
            if (i < animals.length - 1){
                System.out.println("Siguiente fila");
            } else {
                System.out.println("Gracias por todo");
            }
        }

        return animals;
    }

    static String[] selectRandoms(String[][] data){
        String[] selectedAnimals = new String[data.length];
        Random r = new Random();
        for (int i = 0; i < selectedAnimals.length; i++) {
             selectedAnimals[i] = data[i][r.nextInt(2)];
        }

        return selectedAnimals;
    }
    
    public static void main(String[] args) {
        
        // showInfo(getData());
        //  showInfo(getAnimals());


        String[][] animals = getAnimals();
        showInfo(animals);

        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        while(wantContinue) {

            String[] selectAnimals = selectRandoms(animals);
            showData(selectAnimals);


            System.out.println("¿Quieres continuar (S/N)?");
            String answer = scanner.nextLine();
            if(
                answer.toLowerCase().equals("n") ||
                answer.toLowerCase().equals("no")
            ) {
                wantContinue = false;
            }

        }

        scanner.close();
        System.out.println("Gracias por todo");

        
    }
}
