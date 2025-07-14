package local.collections.exercises.EX06_PhoneSet;

import java.util.HashSet;
import java.util.Set;

public class PhoneSetApp {
    Set<Employee> empList = new HashSet<>();

    void addEntry (Employee e){
        empList.add(e);
    }

    void showDirectory(){
        for (Employee employee : empList) {
            System.out.println(employee);
            System.out.println("-".repeat(20));
        }
    }

    void Employee searchEntry(String name, String surname, String surname2,)

    


    public static void main(String[] args) {
        
    }
}
