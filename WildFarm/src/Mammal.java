import java.text.DecimalFormat;

public class Mammal extends Animal{
    protected String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    protected String makeSound() {
        return null;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]", this.getAnimalType(),
                                    this.getAnimalName(), format.format(this.getAnimalWeight()),
                                    this.getLivingRegion(), this.getFoodEaten());
    }
}
