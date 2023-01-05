import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCars; i++) {
            String inputs = scanner.nextLine();
            String[] lines = inputs.split(" ");

            Car car = new Car();
            car.setBrand(lines[0]);
            car.setModel(lines[1]);
            car.setHorsePower(Integer.parseInt(lines[2]));

            System.out.println(car.carInfo());
        }

        scanner.close();
    }
}