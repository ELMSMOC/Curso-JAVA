package local.collections.exercises.Ex04_Shapes;

public class Triangle implements IShape {

    private double height;
    private double side;

    public Triangle(int height, int side) {
        this.height = height;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = (height * side) / 2;
        return area;
    }

    @Override
    public String toString() {
        return "Triangle [height=" + height + ", side=" + side + "]" + " Area Total: " + this.calculateArea();
    }

}
