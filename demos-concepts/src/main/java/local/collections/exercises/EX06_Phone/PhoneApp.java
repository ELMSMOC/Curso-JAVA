package local.collections.exercises.EX06_Phone;

import java.util.HashMap;
import java.util.Map;

public class PhoneApp {
    Map<Integer, Employee> tlfMap = new HashMap<>();

    PhoneApp (){
        showMap();
    }



    void addEntry(Employee e){
        tlfMap.put(
            "654987651",
            new Employee(1, "Raquel", "Sanz", "Rodriguez", "13/12/1934")
        );
        tlfMap.put(
            "494634788",
            new Employee(4, "Pilar", "Gutierrez", "Lorenzo", "03/01/1978")
            );
        tlfMap.put(
            "246335794",
            new Employee(9, "Raul", "Marin", "Soldado", "24/04/1955")
            );
    }

    void showMap(){
        System.out.println(tlfMap);
    }


    public static void main(String[] args) {
        PhoneApp n1 = new PhoneApp();
    }

}
