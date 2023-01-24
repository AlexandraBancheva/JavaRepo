public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    protected abstract String makeSound();

    protected void eat(Food food) throws Exception {
        this.foodEaten += food.getQuantity();
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }
}
