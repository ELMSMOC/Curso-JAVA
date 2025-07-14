package local.collections.exercises.EX06_PhoneSet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Employee {
    int id;
    String name;
    String surname;
    String surname2;
    LocalDate date;
    String tlf;

    public Employee(int id, String name, String surname, String surname2, String date, String tlf) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.surname2 = surname2;
        this.date = formatDate(date);
        this.tlf = tlf;
    }

    private LocalDate formatDate (String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        return date;
    }


    
}
