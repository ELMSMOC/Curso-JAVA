public class Car2 {
    
    static private int numCars = 0;
    private int id;

    private int seatsNum;
    private String color;
    private int doorCount;
    private String brand;
    private char type;
    private boolean isAuto;
    

    Car2(
        int seatsNum,
        String color,
        int doorCount,
        String brand,
        char type,
        boolean isAuto
        ){
        this.seatsNum = seatsNum;
        this.color = color;
        this.doorCount = doorCount;
        this.brand = brand;
        this.type = type;
        this.isAuto= isAuto;
        numCars= numCars + 1;
        this.id = numCars;
    }

    void showInfo(){
        String message = """
            Id: %s
            Numero de asientos %s
            Color %s
            Numero de puertas %s
            Marca %s
            Es automatico? %s
            Tipo %s
                    """;
            System.out.println(message.formatted(id, seatsNum, color, doorCount, brand, type, isAuto));
    }
}