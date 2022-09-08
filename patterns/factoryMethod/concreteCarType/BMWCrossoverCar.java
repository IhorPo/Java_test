package patterns.factoryMethod.concreteCarType;

import patterns.factoryMethod.Car;
import patterns.factoryMethod.CarType;

public class BMWCrossoverCar extends Car {
    @Override
    public int carCost() {
        int cost = CarType.CROSSOVER.cost + 500;

        return  cost;
    }

    @Override
    public void carSeller() {
        System.out.println("Thanks for buying our BMW Crossover car");
    }
}
