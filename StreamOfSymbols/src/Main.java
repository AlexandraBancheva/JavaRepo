import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for (char i = 'a'; i <= 'z' ; i++) {
        //     System.out.println(i);
        // }

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            System.out.println(letter);
        }

        scanner.close();
    }
}