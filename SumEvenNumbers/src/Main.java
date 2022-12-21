import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = new int[6];
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        for (int i = 0; i <= input.length - 1; i++) {
            if (input[i] % 2 == 0){
                sum += input[i];
            }
        }

        System.out.println(sum);
    }
}