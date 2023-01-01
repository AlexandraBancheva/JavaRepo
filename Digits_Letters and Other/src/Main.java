import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(ReturnAllDigits(word));
        System.out.println(ReturnAllLetters(word));
        System.out.println(ReturnAllOtherCharacters(word));

        scanner.close();
    }

    public static String ReturnAllDigits(String word){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            Character digit = word.charAt(i);
            if (Character.isDigit(digit)) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    public static String ReturnAllLetters(String word){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            Character letter = word.charAt(i);
            if (Character.isLetter(letter)) {
                sb.append(letter);
            }
        }
        return sb.toString();
    }

    public static String ReturnAllOtherCharacters(String word){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            Character other = word.charAt(i);
            if (!Character.isLetter(other) && !Character.isDigit(other)) {
                sb.append(other);
            }
        }
        return sb.toString();
    }
}