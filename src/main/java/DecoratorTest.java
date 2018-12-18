import domain.OffroadCar;
import domain.RaceCar;
import domain.SimpleCar;
import interfaces.Car;

public class DecoratorTest {

    public static void main(String[] args) {
        Car car = new SimpleCar();
        printCarInfo(car);

        Car raceCar = new RaceCar(car);
        printCarInfo(raceCar);

        Car offroadCar = new OffroadCar(car);
        printCarInfo(offroadCar);

        Car weirdCar = new OffroadCar(raceCar);
        printCarInfo(weirdCar);
    }

    private static void printCarInfo(Car car) {
        System.out.println(car.getDescription());
        System.out.println("The maximum speed of this car is " + car.getMaximumSpeed());
    }
}
