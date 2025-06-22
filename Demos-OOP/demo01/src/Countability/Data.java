package Countability;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {
    // Compañia/Cliente
    private String name = "Quimica sl";
    private String address = "C/ Jacinto Benavente 24, 6ºB";
    private int tlf = 678123123;
    private String nif= "456s8vf";

    private static List<Data> customerList = new ArrayList<Data>();

    public static void prepareCustomerList(){
        Data cu1 = new Data("Joaquin", "Esquina Tomas 3, 4ºf", 951756456, "423423L");
        Data cu2 = new Data("Paul", "Calle aldara, 3", 984786459, "342535L3");
        Data cu3 = new Data("Rodri", "Avenida Luis XI", 95478445, "34335L3");
        Data cu4 = new Data("Carlos", "Puente de los franceses 33", 327568459, "1365453f");
        Data cu5 = new Data("Vuru", "Fernandez de los rios 53", 654786951, "4565453");
        Data cu6 = new Data("Sandra", "Malagon 46, 3B", 951234568, "651224");
    }


    public static void printCustomerNameList(){
        for (Data customer : customerList) {
            String message ="Cl: " + customer.name;
                System.out.println(message);
        }
    }

    public static int askClient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que cliente quieres?");
        String answer = scanner.nextLine();
        String name = answer.toLowerCase();
        int i = 0;
            for (Data customer : customerList) {
                if (customer.name.toLowerCase().contains(name)) {
                    System.out.println("Has elegido a " + customer.name);
                    return i;
                }
                i++;
            }
            return i;
    }

    public static void showCompanyData(){
        int i=0;
        String messageComp = """
            Nombre de la companía; %s
            Direccion: %s,
            N.I.F.: %s,
            Teléfono: %s
                """;
        for (Data customer : customerList) {
            if(i>0){
                System.out.println(messageComp.formatted(customer.name,customer.address,customer.nif,customer.tlf));
                break;
            }

        }
    }

    // public static void showClientData(){
        
    //     String messageComp = """
    //         Nombre del cliente; %s
    //         Direccion: %s,
    //         Teléfono: %s
    //         D.N.I.: %s,
    //             """;
    //     System.out.println(messageComp.formatted(name,address,tlf,nif));
    // }
     

    public Data(String name, String address, int tlf, String nif){
        this.name = name;
        this.address = address;
        this.tlf = tlf;
        this.nif = nif;
        customerList.add(this);
        showCompanyData();
    }
}
