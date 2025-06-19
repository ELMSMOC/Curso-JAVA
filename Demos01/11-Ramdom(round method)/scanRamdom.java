
import java.util.Random;

public class scanRamdom {

    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random);

        Random randomCreator = new Random();
        int random2 = randomCreator.nextInt(2) + 1;
        System.out.println(random2);
    }
}
