import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputs = scanner.nextLine();
        String result = "";

        while(!inputs.equals("end")) {
            for (int i = inputs.length() - 1; i >= 0 ; i--) {
                char letter = inputs.charAt(i);
                result += letter;
            }
            System.out.println(inputs + "=" + result);
            result = "";
            inputs = scanner.nextLine();
        }
        scanner.close();
    }
}