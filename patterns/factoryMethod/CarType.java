package patterns.factoryMethod;

public enum CarType {
    HATCHBACK(1000),
    CROSSOVER(1500),
    SEDAN(2000),
    SPORT(3000),
    MINIVAN(1700);

    final public int cost;

    CarType(int cost){
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "cost=" + cost +
                '}';
    }
}
