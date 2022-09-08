package patterns.factoryMethod.concreteCarType;

import patterns.factoryMethod.Car;
import patterns.factoryMethod.CarType;

public class BMWSedanCar extends Car {
    @Override
    public int carCost() {
        int cost = CarType.SEDAN.cost + 500;

        return  cost;
    }

    @Override
    public void carSeller() {
        System.out.println("Thanks for buying our BMW Sedan car");
    }
}
