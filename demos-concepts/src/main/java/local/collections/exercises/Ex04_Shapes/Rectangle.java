package local.collections.exercises.Ex04_Shapes;

public class Rectangle implements IShape {

    private int height;
    private int side;

    public Rectangle (int height, int side) {
        this.height = height;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        int area = height * side;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle [height=" + height + ", side=" + side + "]" + " Area Total: " + this.calculateArea();
    }

}
