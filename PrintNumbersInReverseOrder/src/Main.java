import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        scanner.close();
    }
}