import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        car.setBrand("Toyota");
        car.setModel("Yaris");
        car.setHorsePower(88);

        System.out.println(car.carInfo());
    }
}