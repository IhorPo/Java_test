package patterns.factoryMethod;

import patterns.factoryMethod.carBrands.BMW;

public class Main {
    public static void main(String[] args) {
        Factory car1 = new BMW();
        car1.order(CarType.SPORT);

        System.out.println("###################");

        Factory car2 = new BMW();
        car2.order(CarType.HATCHBACK);

    }
}
