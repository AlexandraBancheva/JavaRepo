import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split(" ");
        int numberOfElementsToAdd = Integer.parseInt(inputLine[0]);
        int numberOfElementsToDequeue = Integer.parseInt(inputLine[1]);
        int elementToCheck = Integer.parseInt(inputLine[2]);

        Queue<Integer> queueOfInteger = new ArrayDeque<>();

        for (int i = 0; i < numberOfElementsToAdd; i++) {
            int number = scanner.nextInt();
            queueOfInteger.add(number);
        }

        for (int i = 0; i < numberOfElementsToDequeue; i++) {
            queueOfInteger.remove();
        }

        if (queueOfInteger.size() == 0) {
            System.out.println(queueOfInteger.size());
        } else {
            if (queueOfInteger.contains(elementToCheck)) {
                System.out.println(true);
            } else {
                int temp = queueOfInteger.peek();

                for (Integer num: queueOfInteger) {
                 if (num < temp){
                     temp = num;
                 }
                }
                System.out.println(temp);
            }
        }
        scanner.close();
    }
}