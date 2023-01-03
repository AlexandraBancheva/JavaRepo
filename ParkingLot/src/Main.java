import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> parkingLot = new HashSet<>();

        String[] inputLine = scanner.nextLine().split(", ");

        while(inputLine.length == 2) {
            String direction = inputLine[0];
            String carNumber = inputLine[1];

            if (direction.equals("IN")) {
                parkingLot.add(carNumber);
            } else if(direction.equals("OUT")) {
                parkingLot.remove(carNumber);
            }

            inputLine = scanner.nextLine().split(", ");
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println(String.join("\n", parkingLot));
        }

        scanner.close();
    }
}