package domain;

import interfaces.Car;

public class SimpleCar implements Car {

    public long getMaximumSpeed() {
        return 45;
    }

    public String getDescription() {
        return "This is a car";
    }
}
