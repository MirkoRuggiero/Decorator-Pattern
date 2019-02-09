package patterns.structural.adapter.adaptee;

public class Rhombus implements GeometricShape {

    private final double side;

    public Rhombus() {
        this(1.0d);
    }

    public Rhombus(double a) {
        this.side = a;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 2 * (side + side);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing Rhombus with area: " + area() + " and perimeter: " + perimeter());
    }
}
