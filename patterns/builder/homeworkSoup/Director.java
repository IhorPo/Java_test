package patterns.builder.homeworkSoup;

public class Director {
    public void Borsch(SoupBuilder builder){
        builder.setName("Borsch")
                .setLittersOfWater(5)
                .setVegetables(Vegetables.CABBAGE,
                        Vegetables.CARROT,
                        Vegetables.GREEN,
                        Vegetables.POTATO,
                        Vegetables.BEET)
                .setMeat(Meat.BEEF)
                .setSeasonings(Seasonings.BLACKPEPPER,
                        Seasonings.ROSEMARY);
    }
}
