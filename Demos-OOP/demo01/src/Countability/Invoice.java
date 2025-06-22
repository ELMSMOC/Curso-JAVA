package Countability;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private String date;
    public static int id = 0;

    public static List<Invoice> invoiceList = new ArrayList<Invoice>();

    public static void updateCounterId() {
        Invoice.id++;
    }

    public static void printDate(){
        LocalDate day = LocalDate.now();
        System.out.println("Fecha de emision: " + day);
    }

    public void printId(){
        System.out.println("Nº Factura:" + id);
        return;
    }

    public Invoice(){
        this.id = id;
        id++;
        invoiceList.add(this);
        updateCounterId();
        printDate();
        printId();
    }
}
