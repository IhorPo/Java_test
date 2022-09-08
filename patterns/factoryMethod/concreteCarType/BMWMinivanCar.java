package patterns.factoryMethod.concreteCarType;

import patterns.factoryMethod.Car;
import patterns.factoryMethod.CarType;

public class BMWMinivanCar extends Car {
    @Override
    public int carCost() {
        int cost = CarType.MINIVAN.cost + 500;

        return  cost;
    }

    @Override
    public void carSeller() {
        System.out.println("Thanks for buying our BMW Minivan car");
    }
}
