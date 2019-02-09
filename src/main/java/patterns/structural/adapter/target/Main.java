package patterns.structural.adapter.target;

import patterns.structural.adapter.target.objects.Circle;
import patterns.structural.adapter.target.objects.Drawing;
import patterns.structural.adapter.target.objects.Rectangle;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        drawing.draw();
        drawing.resize();
    }
}
