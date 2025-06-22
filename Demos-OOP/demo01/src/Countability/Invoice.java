package Countability;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private int id = 0;
    private String date;

    public static List<Invoice> invoiceList = new ArrayList<Invoice>();

    public void printDate(){
        LocalDate day = LocalDate.now();
        System.out.println("Fecha de emision: " + day);
    }

    public void printId(){
        System.out.println("Nº Factura:" + id);
        return;
    }

    public Invoice(int id){
        this.id = id;
        id++;
        this.printDate();
        this.printId();
        invoiceList.add(this);
    }
}
