import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> registerLicenseNumbers = new HashMap<String, String>();
        String username = "";

        int numberOfCommands = scanner.nextInt();


        for (int i = 0; i < numberOfCommands; i++) {
            String[] inputs = scanner.nextLine().Split(" ");
            if (inputs[0] == "register") {
                username = inputs[1];
                String licensePlateNumber = inputs[2];

                registerLicenseNumbers.put(username, licensePlateNumber);
            } else if (inputs[0] == "unregister") {
                username = inputs[1];
            }
        }

        scanner.close();
    }
}