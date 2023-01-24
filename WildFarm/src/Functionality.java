import java.util.ArrayList;
import java.util.List;

public abstract class Functionality {
    public static List<Animal> animalsData = new ArrayList<>();

    public static void execute(String[] animalData, String[] food){
        Animal animal = null;
        String animalType = animalData[0];
        String animalName = animalData[1];
        double animalWeight = Double.parseDouble(animalData[2]);
        String livingRegion = animalData[3];

        int foodQuantity = Integer.parseInt(food[1]);

        Food foodType = createFood(food);

        switch (animalType){
            case "Cat":
                String catBreed = animalData[4];
                animal = new Cat(animalType, animalName, animalWeight, livingRegion, catBreed);
                break;
            case "Tiger":
                animal = new Tiger(animalType, animalName, animalWeight, livingRegion);
                break;
            case "Zebra":
                animal = new Zebra(animalType, animalName, animalWeight, livingRegion);
                break;
            case "Mouse":
                animal = new Mouse(animalType, animalName, animalWeight, livingRegion);
                break;
        }

        animalsData.add(animal);
        System.out.println(animal.makeSound());

        try {
            animal.eat(foodType);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Animal> getAnimalsData() {
        return animalsData;
    }

    private static Food createFood(String[] food){
        String foodType = food[0];
        int foodQuantity = Integer.parseInt(food[1]);

        return foodType.equals("Meat") ? new Meat(foodQuantity) : new Vegetable(foodQuantity);
    }
}
