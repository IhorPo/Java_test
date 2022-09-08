package patterns.builder.homeworkSoup;

import java.util.List;

public class Soup {
    private String name;
    private int littersOfWater;
    private List<Vegetables> vegetables;
    private List<Meat> meat;
    private List<Seasonings> seasonings;

    public Soup(String name, int littersOfWater, List<Vegetables> vegetables, List<Meat> meat, List<Seasonings> seasonings) {
        this.name = name;
        this.littersOfWater = littersOfWater;
        this.vegetables = vegetables;
        this.meat = meat;
        this.seasonings = seasonings;
    }

    public String getName() {
        return name;
    }

    public int getLittersOfWater() {
        return littersOfWater;
    }

    public List<Vegetables> getVegetables() {
        return vegetables;
    }

    public List<Meat> getMeat() {
        return meat;
    }

    public List<Seasonings> getSeasonings() {
        return seasonings;
    }

    @Override
    public String toString() {
        return "Soup{" +
                "name='" + name + '\'' +
                ", littersOfWater=" + littersOfWater +
                ", vegetables=" + vegetables +
                ", meat=" + meat +
                ", seasonings=" + seasonings +
                '}';
    }
}
