import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        String input = scanner.nextLine();

        while(!input.contains("Beast!")){
            String[] line = scanner.nextLine().split(" ");
            String name = line[0];
            int age = Integer.parseInt(line[1]);
            String gender = line[2];
            try{
                createNewAnimal(input, name, age, gender, animals);
            } catch (Exception exception){
                System.out.println(exception.getMessage());
            }
            input = scanner.nextLine();
        }

        animals.forEach(System.out::println);
        scanner.close();
    }

    public static void createNewAnimal(String animalType, String name, int age, String gender, List<Animal> animals){
        switch (animalType){
            case "Dog":
                animals.add(new Dog(name, age, gender));
                break;
            case "Cat":
                animals.add(new Cat(name, age, gender));
                break;
            case "Frog":
                animals.add(new Frog(name, age, gender));
                break;
            case "Kitten":
                animals.add(new Kitten(name, age, gender));
                break;
            case "Tomcat":
                animals.add(new Tomcat(name, age, gender));
                break;
        }
    }
}