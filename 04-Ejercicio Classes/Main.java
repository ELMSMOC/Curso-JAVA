
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(4, "Red", 5, "Seat", 'D', true);
        Car car2 = new Car(3, "Yellow", 3, "Mercedes", 'S', false);
        Car car3 = new Car(6, "Red", 3, "Ferrari", 'V' ,false);

        System.out.println("""
            Numero de asientos %s
            Color %s
            Numero de puertas %s
            Marca %s
            Es automatico? %s
            Tipo %s
                    """.formatted(seatsNum, color, doorCount, brand, type, isAuto));
    }
}
