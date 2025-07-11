package local.collections.exercices;

public class Triangle extends Shape {

    private int height;
    private int side;

    public Triangle(int height, int side) {
        this.height = height;
        this.side = side;
    }

    @Override
    public double calculateArea(int height, int side) {
        double area = (height * side) / 2;
        return area;
    }

}
