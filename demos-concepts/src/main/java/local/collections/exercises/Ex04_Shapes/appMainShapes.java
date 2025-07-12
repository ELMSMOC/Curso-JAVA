package local.collections.exercises.Ex04_Shapes;

import java.util.ArrayList;
import java.util.List;

public class appMainShapes {

    List<IShape> shapeList = new ArrayList<>();
    double totalArea = 0;

    void addShape(IShape shape){
        shapeList.add(shape);
    }

    void calculateTotalArea(){
        shapeList.forEach(
            i -> totalArea += i.calculateArea()
        );
    }
    
    void showTotalArea (){
        shapeList.forEach(shape -> System.out.println(shape));
        System.out.println("Suma de todas las areas es %.2f%n".formatted(totalArea));
    }



    public static void main(String[] args) {

        appMainShapes shapes = new appMainShapes();

        shapes.addShape(new Circle(4));
        shapes.addShape(new Triangle(5, 6));
        shapes.addShape(new Rectangle(4, 6));

        shapes.calculateTotalArea();
    }
}
