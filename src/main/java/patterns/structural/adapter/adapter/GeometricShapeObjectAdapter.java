package patterns.structural.adapter.adapter;

import patterns.structural.adapter.adaptee.GeometricShape;
import patterns.structural.adapter.adaptee.Rhombus;
import patterns.structural.adapter.adaptee.Triangle;
import patterns.structural.adapter.target.objects.Shape;

public class GeometricShapeObjectAdapter implements Shape {

    private GeometricShape adaptee;

    public GeometricShapeObjectAdapter(GeometricShape adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + " can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        if (adaptee instanceof Triangle) {
            return "Triangle object";
        } else if (adaptee instanceof Rhombus) {
            return "Rhombus object";
        } else {
            return "Unknown object";
        }
    }

    @Override
    public boolean isHidden() {
        return false;
    }
}
