import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> miners = new HashMap<String, Integer>();

        String[] inputLine =  scanner.nextLine().split(" ");

        while (inputLine.length != 1){
            if (inputLine.equals("stop")) {
                break;
            }
            String resource = inputLine[0].toLowerCase();
            int quantity = Integer.parseInt(inputLine[1]);

            if (miners.containsKey(resource)) {
                miners.put(resource, miners.get(resource) + quantity);
            } else {
                miners.put(resource, quantity);
            }
            inputLine =  scanner.nextLine().split(" ");
        }

        miners.entrySet().forEach(m -> System.out.println(m.getKey() + " -> " + m.getValue()));
        scanner.close();
    }
}