package patterns.structural.adapter.client;

import patterns.structural.adapter.adaptee.Rhombus;
import patterns.structural.adapter.adaptee.Triangle;
import patterns.structural.adapter.adapter.GeometricShapeObjectAdapter;
import patterns.structural.adapter.target.objects.Circle;
import patterns.structural.adapter.target.objects.Drawing;
import patterns.structural.adapter.target.objects.Rectangle;

public class AdapterTest {

    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        //target objects
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        //adaptee objects
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));

        //they
        drawing.draw();
        drawing.resize();
    }
}
