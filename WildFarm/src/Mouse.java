public class Mouse extends Mammal{
    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    protected String makeSound() {
        return "SQUEEEAAAK!";
    }

    @Override
    protected void eat(Food food) throws Exception {
        if (food instanceof Vegetable){
            throw new Exception("Mice are not eating that type of food!");
        }
        super.eat(food);
    }
}
