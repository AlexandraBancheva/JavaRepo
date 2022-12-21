import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        while (number < 1 || number > 100) {
            System.out.println("Invalid number!");
            number = Integer.parseInt(scanner.nextLine());
        }

        //System.out.println(String.format("The number is: " + number));
        System.out.printf("The number is %d", number);
    }
}