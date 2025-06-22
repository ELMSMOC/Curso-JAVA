package Countability;
import java.util.ArrayList;
import java.util.List;

public class Data {
    // Compañia/Cliente
    private String name = "Quimica sl";
    private String address = "C/ Jacinto Benavente 24, 6ºB";
    private int tlf = 678123123;
    private String nif= "456s8vf";

    public void showCompanyData(){
        
        String messageComp = """
            Nombre de la companía; %s
            Direccion: %s,
            N.I.F.: %s,
            Teléfono: %s
                """;
        System.out.println(messageComp.formatted(name,address,tlf,nif));
    }

    public void showClientData(){
        
        String messageComp = """
            Nombre del cliente; %s
            Direccion: %s,
            Teléfono: %s
            D.N.I.: %s,
                """;
        System.out.println(messageComp.formatted(name,address,nif,tlf));
    }
     

    public Data(){
        this.showCompanyData();
    }
}
