public class Shapes {
    

    // Sobrecarga de funciones, se pueden añadir cuantas quieras con el mismo nombre mientras tengan tipos o parametros diferentes
    
    public static double area(double side) {
        return side * side;
    }

    public static double area(double base, double height) {
        return base * height;
    }

    public static void main(String[] args){
        System.out.println(area(2));
        System.out.println(area(3.6));
        System.out.println(area(5));

        System.out.println(area(5, 2));
    }
}