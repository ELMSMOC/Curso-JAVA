package local.collections.exercices;

public class Circle extends Shape {

    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea(int radio) {
        double area = 2 * ( Math.PI * radio);
        area *= area;
        return area;
    }

}
