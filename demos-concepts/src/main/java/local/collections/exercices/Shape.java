package local.collections.exercices;

import java.util.ArrayList;
import java.util.List;

public class Shape implements IShape {
    private double area;

    List<IShape> shapeList = new ArrayList<IShape>();

    public Shape(){
        shapeList.add(this);
    }

    @Override
    public double calculateArea(int height, int side) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
    }

    @Override
    public double calculateArea(int radio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
    }

    @Override
    public void getAreasList() {
        for (Object shape : shapeList) {
            System.out.println(shape);
        }
    }

}
