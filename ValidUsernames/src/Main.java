import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(", ");
        String result = ValidUsernames(names);
        System.out.println(result);

        scanner.close();
    }

    public static String ValidUsernames(String[] names){
        StringBuilder sb = new StringBuilder();
        String text = "";
        for (String name: names) {
            if (name.length() >= 3 && name.length() <= 16) {
                for (int i = 0; i < name.length(); i++) {
                    Character letter = name.charAt(i);
                    if (Character.isDigit(letter) || Character.isLetter(letter) || letter.equals('-') || letter.equals('_')) {
                        text += letter;
                    }
                }
            }

            if (text.length() != name.length()) {
                text = "";
            } else {
                sb.append(text);
                sb.append("\n");
                text = "";
            }
        }

       return sb.toString();
    }
}