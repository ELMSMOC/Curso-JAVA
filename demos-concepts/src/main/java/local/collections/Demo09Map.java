package local.collections;

import java.util.HashMap;
import java.util.Map;

public class Demo09Map {

    Map<Character, String> map = new HashMap<>();

    public Demo09Map() {
        useMap();
    }

    public void useMap(){
        map.put('A', "Alpha");
        map.put('B', "Beta");
        map.put('C', "Charlie");

        map.put('A', "Rafita"); // Solo actualiza el valor ya que la key ya exixtia y no se puede duplicar
        map.replace('B', "Balded");

        map.replace('Z', "Zeta"); // No hace nada al no existir la key

        map.remove('C');
    }

    public void showMap(){
        System.out.println(map.values());
        System.out.println(map.keySet());

        System.out.println(map.get('R'));
    }

    public static void main(String[] args) {
        Demo09Map map = new Demo09Map();

        map.showMap();
    }
}
