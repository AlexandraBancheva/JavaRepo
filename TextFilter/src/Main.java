import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner
                .nextLine()
                .split(", ");

        String text = scanner.nextLine();

        for (String word: words) {
            text = text.replace(word, CreateStars("*", word.length()));
        }

        System.out.println(text);

        scanner.close();
    }

    public static String CreateStars(String character, int repeatedTimes) {
        StringBuilder replacement = new StringBuilder();
        for (int i = 0; i < repeatedTimes; i++) {
            replacement.append(character);
        }
        return replacement.toString();
    }
}