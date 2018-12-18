package domain;

import decorator.CarDecorator;
import interfaces.Car;

public class OffroadCar extends CarDecorator {

    public OffroadCar(Car car) {
        super(car);
    }

    @Override
    public long getMaximumSpeed() {
        return super.getMaximumSpeed() + 45;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " to go offroad";
    }

}
