import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Yaris";
        car.horsePower = 88;

        System.out.println(String.format("The car is: %s %s - %d HP", car.brand, car.model, car.horsePower));
    }
}