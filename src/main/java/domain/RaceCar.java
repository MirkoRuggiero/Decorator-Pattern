package domain;

import decorator.CarDecorator;
import interfaces.Car;

public class RaceCar extends CarDecorator {

    public RaceCar(Car car) {
        super(car);
    }

    @Override
    public long getMaximumSpeed() {
        return super.getMaximumSpeed() + 100;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " to race";
    }
}
