import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stackOfNumbers = new Stack<>();

        String[] inputLine = scanner.nextLine().split(" ");
        int numberOfElements = Integer.parseInt(inputLine[0]);
        int numberOfElementsToPop = Integer.parseInt(inputLine[1]);
        int numberForCheck = Integer.parseInt(inputLine[2]);

        for (int i = 0; i < numberOfElements; i++) {
            int number = scanner.nextInt();
            stackOfNumbers.push(number);
        }

        for (int i = 0; i < numberOfElementsToPop; i++) {
            stackOfNumbers.pop();
        }

        if (stackOfNumbers.size() == 0) {
            System.out.println(stackOfNumbers.size());
        } else {
            if (stackOfNumbers.contains(numberForCheck)) {
                System.out.println(true);
            } else {
                int temp = stackOfNumbers.peek();
                for (Integer num: stackOfNumbers) {
                    if (num < temp) {
                        temp = num;
                    }
                }
                System.out.println(temp);
            }
        }
        scanner.close();
    }
}