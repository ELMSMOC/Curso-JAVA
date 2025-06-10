public class Shapes {
    
    public static double square(double side) {
        double area = side * side;
        return area;
    }

    public static void main(String[] args){
        System.out.println(square(2));
        System.out.println(square(3.6));
        System.out.println(square(5));
    }
}