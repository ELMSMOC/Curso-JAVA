import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;

public class arrayDemo {

    public static int[] foo(int[] data){
        int[] newData = data.clone();
        newData[0] = 400;
        return newData;
    }
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,89};
        int[] data2 = data;
        int[] data3 = {1,2,3,4,5,89};

        System.out.println(data == data2); // true
        System.out.println(data == data3); // false

        foo(data3);
        System.out.println(data3); // Imprime referencia

        // List<Integer> list = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(75);
        System.out.println(list);
        System.out.println(data3[0]); // antes 400, ahora 1
    }
}
