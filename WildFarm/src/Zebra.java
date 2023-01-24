public class Zebra extends Mammal{
    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    protected String makeSound() {
        return "Zs";
    }

    @Override
    protected void eat(Food food) throws Exception {
        if(!(food instanceof Vegetable)){
            throw new Exception("Zebras are not eating that type of food!");
        }
        super.eat(food);
    }
}
