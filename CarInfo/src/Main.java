import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        Car car;

        for (int i = 0; i < numberOfCars; i++) {
            String inputs = scanner.nextLine();
            String[] lines = inputs.split(" ");

            if (lines.length == 1){
                car = new Car(lines[0]);
            } else {
                car = new Car(lines[0], lines[1], Integer.parseInt(lines[2]));
            }

            System.out.println(car.carInfo());
        }

        scanner.close();
    }
}