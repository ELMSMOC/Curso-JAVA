public class Car {
    int seatsNum;
    String color;
    int doorCount;
    String brand;
    char type;
    boolean isAuto;

    Car(int seatsNum, String color, int doorCount, String brand, char type, boolean isAuto){
        this.seatsNum = seatsNum;
        this.color = color;
        this.doorCount = doorCount;
        this.brand = brand;
        this.type = type;
        this.isAuto= isAuto;
    }

    void showInfo(){
        String message = """
            Numero de asientos %s
            Color %s
            Numero de puertas %s
            Marca %s
            Es automatico? %s
            Tipo %s
                    """;
            System.out.println(message.formatted(seatsNum, color, doorCount, brand, type, isAuto));
    }
}