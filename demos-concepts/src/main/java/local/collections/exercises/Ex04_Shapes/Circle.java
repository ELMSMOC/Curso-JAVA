package local.collections.exercises.Ex04_Shapes;

public class Circle implements IShape {

    private double radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        double area = 2 * ( Math.PI * radio);
        area *= area;
        return area;
    }

    @Override
    public String toString() {
        return "Circle [radio=" + radio + "]" + " Area Total: " + this.calculateArea();
    }

}
