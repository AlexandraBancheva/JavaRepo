import java.text.DecimalFormat;

public class Cat extends Felime{
    private final String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    protected String makeSound() {
        return "Meowwww";
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %s, %d]", this.getClass().getSimpleName()
                , this.getAnimalName(), this.getBreed()
                , format.format(this.getAnimalWeight()), this.getLivingRegion(), this.getFoodEaten());
    }
}
