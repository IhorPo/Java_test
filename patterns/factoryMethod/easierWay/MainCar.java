package patterns.factoryMethod.easierWay;

public class MainCar {
    public static void main(String[] args) {

        Factory factory = new Factory();
        Car car1 = factory.create("Dodge");
        car1.creation();

    }
}

// Car is product
abstract class Car{
    public abstract void creation();
}

// Classes that will create this product
class Porsche extends Car{

    @Override
    public void creation() {
        System.out.println("Porsche created");
    }
}

class Dodge extends Car{

    @Override
    public void creation() {
        System.out.println("Dodge created");
    }
}

// Class that will create concrete product
class Factory{
    public Car create(String type){
        switch (type){
            case("Dodge"):
                return new Dodge();
            case("Porsche"):
                return  new Porsche();
        }
        return null;
    }
}