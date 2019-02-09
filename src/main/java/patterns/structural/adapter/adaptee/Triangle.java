package patterns.structural.adapter.adaptee;

public class Triangle implements GeometricShape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle() {
        this(1.0d, 1.0d, 1.0d);
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Heron's Formula for the area of a triangle(Hero's Formula)
     * A method for calculating the area of a triangle when you know the lengths of all three sides.
     * <p>
     * Let a,b,c be the lengths of the sides of a triangle. The area is given by:
     * Area	=	 √	 p	 (	p	−	a	) 	(	p	−	b	)	 (	p	−	c	)
     * where p is half the perimeter, or
     * (a	+	b	+	c )/2
     *
     * @return
     */
    @Override
    public double area() {
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing Triangle with area " + area() + " and perimeter " + perimeter());
    }
}
