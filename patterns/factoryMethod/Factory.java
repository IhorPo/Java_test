package patterns.factoryMethod;

public abstract class Factory {

    public Car order(CarType type){
        Car car = creation(type);

        System.out.println("Thanks for your order!");
        return car;
    }

    public abstract Car creation(CarType type);
}
