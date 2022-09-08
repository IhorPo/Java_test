package patterns.builder.homeworkSoup;

import java.util.Arrays;
import java.util.List;

public class SoupBuilder implements Builder{
    private String name;
    private int littersOfWater;
    private List<Vegetables> vegetables;
    private List<Meat> meat;
    private List<Seasonings> seasonings;

    public SoupBuilder(){

    }

    public SoupBuilder(String name, int littersOfWater, List<Vegetables> vegetables, List<Meat> meat, List<Seasonings> seasonings) {
        this.name = name;
        this.littersOfWater = littersOfWater;
        this.vegetables = vegetables;
        this.meat = meat;
        this.seasonings = seasonings;
    }

    public SoupBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public SoupBuilder setLittersOfWater(int littersOfWater) {
        this.littersOfWater = littersOfWater;
        return this;
    }

    public SoupBuilder setVegetables(Vegetables ... vegetables) {
        this.vegetables = Arrays.asList(vegetables);
        return this;
    }

    public SoupBuilder setMeat(Meat ... meat) {
        this.meat = Arrays.asList(meat);
        return this;
    }

    public SoupBuilder setSeasonings(Seasonings ... seasonings) {
        this.seasonings = Arrays.asList(seasonings);
        return this;
    }

    public Soup result(){
        return new Soup(this.name, this.littersOfWater, this.vegetables, this.meat, this.seasonings);
    }
}
