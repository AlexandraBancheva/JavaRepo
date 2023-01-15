import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStream.range(0, 2).mapToObj(i -> scanner.nextLine().split(" ")).forEach(VehicleFactory::create);
        IntStream.range(0, Integer.parseInt(scanner.nextLine())).mapToObj(i -> scanner.nextLine().split(" ")).forEach(VehicleFunctionality::execute);
        VehicleFactory.getInfoVehicles().forEach((key, value) -> System.out.println(value.toString()));
    }
}