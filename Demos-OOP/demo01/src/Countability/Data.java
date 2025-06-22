package Countability;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {
    // Compañia/Cliente
    private String name;
    private String address;
    private int tlf;
    private String nif;

    private static List<Data> customerList = new ArrayList<Data>();

    public static void prepareCustomerList(){
        Data company = new Data("Quimica sl\"", "C/ Jacinto Benavente 24, 6ºB", 678123123, "456s8vf");
        Data cu1 = new Data("Joaquin", "Esquina Tomas 3, 4ºf", 951756456, "423423L");
        Data cu2 = new Data("Paul", "Calle aldara, 3", 984786459, "342535L3");
        Data cu3 = new Data("Rodri", "Avenida Luis XI", 95478445, "34335L3");
        Data cu4 = new Data("Carlos", "Puente de los franceses 33", 327568459, "1365453f");
        Data cu5 = new Data("Vuru", "Fernandez de los rios 53", 654786951, "4565453");
        Data cu6 = new Data("Sandra", "Malagon 46, 3B", 951234568, "651224");
    }


    public static void printCustomerNameList(){
        int i=0;
        for (Data customer : customerList) {
            if (i > 0){
                String message ="Cl: " + customer.name;
                System.out.println(message);
            }
            i++;
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
            Nombre de la companía: %s
            Direccion: %s
            N.I.F.: %s
            Teléfono: %s
                """;
        for (Data customer : customerList) {
            if(i == 0){
                System.out.println(messageComp.formatted(customer.name,customer.address,customer.nif,customer.tlf));
                break;
            }
            i++;
        }
    }

    public static void showClientData(){
        int index = askClient();
        String messageComp = """
            Nombre del cliente; %s
            Direccion: %s,
            Teléfono: %s
            D.N.I.: %s,
                """;
                int i = 0;
        for (Data customer : customerList) {
            if(i == index){
                System.out.println(messageComp.formatted(customer.name,customer.address,customer.nif,customer.tlf));
            }
            i++;
        }
        
    }
     

    public Data(String name, String address, int tlf, String nif){
        this.name = name;
        this.address = address;
        this.tlf = tlf;
        this.nif = nif;
        customerList.add(this);
    }
}
