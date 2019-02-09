package patterns.decorator.decorator;

import patterns.decorator.interfaces.Car;

public class CarDecorator implements Car {

    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public long getMaximumSpeed() {
        return car.getMaximumSpeed();
    }

    public String getDescription() {
        return car.getDescription();
    }
}
