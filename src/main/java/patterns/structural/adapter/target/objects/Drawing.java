package patterns.structural.adapter.target.objects;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Drawing {

    private List<Shape> shapeList = new ArrayList<>();

    public void addShape(Shape shape){
        shapeList.add(shape);
    }

    public List<Shape> getShapeList(){
        return shapeList;
    }

    public void draw() {
        if (shapeList.isEmpty()) {
            System.out.println("Nothing to draw!");
        } else {
            shapeList.forEach(Shape::draw);
        }
    }
    public void resize() {
        if (shapeList.isEmpty()) {
            System.out.println("Nothing to resize!");
        } else {
            shapeList.forEach(Shape::resize);
        }
    }
}
