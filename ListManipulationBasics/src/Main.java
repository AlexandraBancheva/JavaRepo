import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            numbers.add(input);
        }

       // scanner.nextLine();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            String[] lines = line.split(" ");
            String command = lines[0];

            switch (command){
                case "Add":
                    int numForAdd = Integer.parseInt(lines[1]);
                    numbers.add(numForAdd);
                    break;
                case "Remove":
                    int numForRemove = Integer.parseInt(lines[1]);
                    numbers.remove(Integer.valueOf(numForRemove));
                    break;
                case "RemoveAt":
                    int indexForRemove = Integer.parseInt(lines[1]);
                    numbers.remove(indexForRemove);
                    break;
                case "Insert":
                    int valueForAdd = Integer.parseInt(lines[1]);
                    int indexForAdd = Integer.parseInt(lines[2]);
                    numbers.add(indexForAdd, valueForAdd);
                    break;
            }
        }

        System.out.println(numbers.toString());

        scanner.close();
    }
}