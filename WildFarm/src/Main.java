import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (!"End".equals(input = scanner.nextLine())) {
            Functionality.execute(input.split("\\s+"), scanner.nextLine().split("\\s+"));
        }
        Functionality.getAnimalsData().forEach(e -> System.out.println(e.toString()));
    }
}