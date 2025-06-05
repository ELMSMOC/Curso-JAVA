import java.util.Scanner;

public class scanTrainning {
    public static void main(String[] args){

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Que banda te mola?");
        String favoriteBand = scanner1.nextLine();
        System.out.println("Cuantos albumes tiene?");
        int albumNumber = scanner2.nextInt();
        System.out.println("De donde son?");
        String city = scanner1.nextLine();

        System.out.println("Te mola " + favoriteBand);
        System.out.println("Con este numero de albumes " + albumNumber);
        System.out.println("Y son de" + city);

        scanner1.close();
        scanner2.close();


        
    }
}