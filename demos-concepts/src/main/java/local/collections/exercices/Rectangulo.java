package local.collections.exercices;

public class Rectangulo extends Shape {

    private int height;
    private int side;

    public Rectangulo (int height, int side) {
        this.height = height;
        this.side = side;
    }

    @Override
    public double calculateArea(int height, int side) {
        int area = height * side;
        return area;
    }

}
