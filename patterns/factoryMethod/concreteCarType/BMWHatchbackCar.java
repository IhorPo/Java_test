package patterns.factoryMethod.concreteCarType;

import patterns.factoryMethod.Car;
import patterns.factoryMethod.CarType;

public class BMWHatchbackCar extends Car {
    @Override
    public int carCost() {
        int cost = CarType.HATCHBACK.cost + 500;

        return  cost;
    }

    @Override
    public void carSeller() {
        System.out.println("Thanks for buying our BMW Hatchback car");
    }
}
