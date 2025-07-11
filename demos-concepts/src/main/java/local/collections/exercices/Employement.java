package local.collections.exercices;

import java.util.List;

import javax.swing.text.DateFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Employement {
    private String name;
    private String surname;
    private LocalDate date;
    private int id;
    
    private static List<Employement> empList = new ArrayList<Employement>();

    public Employement(String name, String surname, String date, int id) {
        this.name = name;
        this.surname = surname;
        this.date = formatDate(date);
        this.id = id;
        empList.add(this);
    }

    private LocalDate formatDate(String date2) {
        DateFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    static void printList (List<Employement> list){
        for (Employement employement : list) {
            
            System.out.println(employement);
        }
    }

    public static void main(String[] args) {
        Employement emp1 = new Employement("Javi", "Suarez", "29/02/1935", 01);
        Employement emp2 = new Employement("Pedro", "Ardemans", "03/11/1985", 02);


        System.out.println(empList.size());



        
    }
}
