public class Tiger extends Felime{

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    protected String makeSound() {
        return "ROAAR!!!";
    }

    @Override
    protected void eat(Food food) throws Exception {
        if(!(food instanceof Meat)){
            throw new Exception("Tigers are not eating that type of food!");
        }
        super.eat(food);
    }
}
