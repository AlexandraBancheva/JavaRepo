import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> registerLicenseNumbers = new HashMap<String, String>();
        String username = "";

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            // read input
            String inputs = scanner.nextLine();
            String[] input = inputs.split(" ");
            String registerOrNot = input[0];
            if (registerOrNot.equals("register")) {
                username = input[1];
                String licensePlateNumber = input[2];
                if (registerLicenseNumbers.containsKey(username)) {
                    System.out.println(String.format("ERROR: already registered with plate number %s", licensePlateNumber));
                } else {
                    registerLicenseNumbers.put(username, licensePlateNumber);

                    System.out.println(String.format("%s registered %s successfully", username, licensePlateNumber));
                }
            } else if (registerOrNot.equals("unregister")) {
                username = input[1];
                if (!registerLicenseNumbers.containsKey(username)) {
                    System.out.println(String.format("ERROR: user %s not found", username));
                } else {
                    registerLicenseNumbers.remove(username);
                    System.out.println(String.format("%s unregistered successfully", username));
                }
            }
        }

        for (Map.Entry<String, String> user: registerLicenseNumbers.entrySet()) {
            System.out.println(String.format("%s => %s", user.getKey(), user.getValue()));
        }
        scanner.close();
    }
}