import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] array1 = new int[number];
        int[] array2 = new int[number];

        ReadArray(scanner, array1, number);
        ReadArray(scanner, array2, number);

        int sum = 0;

        for (int i = 0; i <= array1.length - 1; i++) {
                if (array1[i] != array2[i]) {
                    System.out.printf("Arrays are not identical. Found difference at %d index", i);
                    break;
                }
                sum += array1[i];
        }

        System.out.println(sum);

        scanner.close();
    }

    public static int[] ReadArray(Scanner scanner, int[] array, int number){
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}