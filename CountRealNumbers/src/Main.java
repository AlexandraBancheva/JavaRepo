import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 4; i++) {
            numbers.add(scanner.nextInt());
        }

        HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();

        for (int number: numbers) {
            if (dict.containsKey(number)) {
                dict.put(number, dict.get(number) + 1);
            } else {
                dict.put(number, 1);
            }
        }

        dict.entrySet().stream().sorted((k, v) -> v.getValue().compareTo(k.getValue()))
                        .forEach(k -> System.out.println(k.getKey() + " -> " + k.getValue()));

        scanner.close();
    }
}