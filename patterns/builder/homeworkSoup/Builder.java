package patterns.builder.homeworkSoup;

public interface Builder {
    SoupBuilder setName(String name);
    SoupBuilder setLittersOfWater(int littersOfWater);
    SoupBuilder setVegetables(Vegetables ... vegetables);
    SoupBuilder setMeat(Meat ... meat);
    SoupBuilder setSeasonings(Seasonings ... seasonings);
    Soup result();
}
