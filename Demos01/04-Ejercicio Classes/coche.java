
public class coche {
    public static void main(String[] args) {
        Car2 car1 = new Car2(4, "Red", 5, "Seat", 'D', true);
        Car2 car2 = new Car2(3, "Yellow", 3, "Mercedes", 'S', false);
        Car2 car3 = new Car2(6, "Red", 3, "Ferrari", 'V' ,false);

        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
    }
}
