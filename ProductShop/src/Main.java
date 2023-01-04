import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> shopProduct = new HashMap<>();
        Map<String, Double> productPrice = new HashMap<>();

        String[] input = scanner.nextLine().split(", ");

        while(input.length != 1){
            String shop = input[0];
            String product = input[1];
            Double price = Double.parseDouble(input[2]);

            if (!shopProduct.containsKey(shop)){
                shopProduct.put(shop, new ArrayList<String>(Arrays.asList(product)));
                productPrice.put(product, price);
            } else {
                shopProduct.get(shop).add(product);
                productPrice.put(product, price);
            }
            input = scanner.nextLine().split(", ");
        }

        for (Map.Entry<String, ArrayList<String>> entity: shopProduct.entrySet()) {
            String shop = entity.getKey();
            ArrayList<String> products = entity.getValue();

            System.out.println(shop + "->");

            for (String product: products) {
                Double price = productPrice.get(product);
                System.out.println("Product: " + product + ", " + "Price: " + price);
            }
        }


        scanner.close();
    }
}