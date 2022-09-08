package patterns.factoryMethod.concreteCarType;

import patterns.factoryMethod.Car;
import patterns.factoryMethod.CarType;

public class BMWSportCar extends Car {
    @Override
    public int carCost() {
        int cost = CarType.SPORT.cost + 500;

        return  cost;
    }

    @Override
    public void carSeller() {
        System.out.println("Thanks for buying our BMW Sport car");
    }

}
