import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> integers = new Stack<Integer>();

        String[] numbers = scanner.nextLine().split(" ");

        for (String digit: numbers) {
            integers.add(Integer.parseInt(digit));
        }

        while(integers.size() != 0) {
            System.out.println(integers.pop());
        }
    }
}