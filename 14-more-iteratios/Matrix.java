public class Matrix {

    static void vector(){
        int[] vertorNumbers = {8, 5, 7, 8, 90, 48};
        String[] vectorNames = new String [4];

        vectorNames[0] = "Pepe";
        vectorNames[1] = "Luisa";
        vectorNames[3] = "Ramon";

        for (int i = 0; i < vertorNumbers.length; i++) {
            System.out.println(vertorNumbers[i]);
        }

        for (String name : vectorNames) {
            System.out.println(name);
        }
    }

    static void matrix(){

        String[][] matrixNames = {
            {"Javier", "Eugenio", "Pedro"},
            {"Perez", "Lazaro", "Ramirez"},
            {"Ruiz", "Martinez", "Casares"}
        };

        int[][] matrixNumbers= new int[3][3];

        matrixNumbers[0][0] = 22;
        matrixNumbers[0][1] = 46;
        matrixNumbers[0][2] = 50;

        matrixNumbers[1][0] = 62;
        matrixNumbers[1][1] = 86;
        matrixNumbers[1][2] = 90;

        matrixNumbers[2][0] = 12;
        matrixNumbers[2][1] = 30;
        matrixNumbers[2][2] = 50;

        for (int i = 0; i < matrixNumbers.length; i++) {
            for (int j = 0; j < matrixNumbers[0].length; j++) {
                System.out.print(matrixNumbers[i][j] + " ");
            }
            System.out.println("");
        }

        for (int[] row : matrixNumbers) {
            for (int item: row) {
                System.out.print(item + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        // vector();
        matrix();
    }
}