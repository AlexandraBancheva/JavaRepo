import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side = Integer.parseInt(scanner.nextLine());
        int area = side * side;

        System.out.println(area);
    }
}