import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> productsPrice = new HashMap<String, Double>();
        HashMap<String, Integer> productsQuantities = new HashMap<String, Integer>();

        String[] inputs = scanner.nextLine().split(" ");

        while (true){
            String product = inputs[0];
            double price = Double.parseDouble(inputs[1]);
            int quantity = Integer.parseInt(inputs[2]);

            if (productsPrice.containsKey(product)) {
                productsQuantities.put(product, productsQuantities.get(product) + quantity);

                double currentPrice = productsPrice.get(product);
                if (currentPrice != price) {
                    productsPrice.put(product, price);
                }
            } else {
                productsPrice.put(product, price);
                productsQuantities.put(product, quantity);
            }
            inputs = scanner.nextLine().split(" ");
            if (inputs.length == 1) {
                break;
            }
        }

        for (Map.Entry<String, Double> entity: productsPrice.entrySet()) {
            int currentProductQuantity = productsQuantities.get(entity.getKey());
            double totalPrice = entity.getValue() * currentProductQuantity;
            System.out.println(String.format(entity.getKey() + "-> " + "%.2f", totalPrice));
        }

        scanner.close();
    }
}