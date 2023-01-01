import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine().toLowerCase();
        String secondString = scanner.nextLine();

        int index = secondString.indexOf(firstString);

        while (index != -1) {
            secondString = secondString.replace(firstString, "");
            index = secondString.indexOf(firstString);
        }

        System.out.println(secondString);
    }
}