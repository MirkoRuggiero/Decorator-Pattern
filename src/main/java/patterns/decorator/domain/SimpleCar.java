package patterns.decorator.domain;

import patterns.decorator.interfaces.Car;

public class SimpleCar implements Car {

    public long getMaximumSpeed() {
        return 45;
    }

    public String getDescription() {
        return "This is a car";
    }
}
