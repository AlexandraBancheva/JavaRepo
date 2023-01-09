import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            Box<String> box = new Box<>(inputLine);
            System.out.println(box);
        }
    }
}