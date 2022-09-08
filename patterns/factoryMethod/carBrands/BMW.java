package patterns.factoryMethod.carBrands;

import patterns.factoryMethod.Car;
import patterns.factoryMethod.CarType;
import patterns.factoryMethod.Factory;
import patterns.factoryMethod.concreteCarType.*;

public class BMW extends Factory {

    @Override
    public Car creation(CarType type) {
        Car car = null;
        switch (type){
            case SPORT:
                car = new BMWSportCar();
                break;
            case HATCHBACK:
                car = new BMWHatchbackCar();
                break;
            case SEDAN:
                car = new BMWSedanCar();
                break;
            case CROSSOVER:
                car = new BMWCrossoverCar();
                break;
            case MINIVAN:
                car = new BMWMinivanCar();
                break;
        }
        car.carSeller();
        System.out.println("Price for car: "+car.carCost());
        return car;
    }

}
