import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<String> products = new ArrayList<String>();

        for (int i = 0; i <= n; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }

        Collections.sort(products);

       // System.out.println(products.toString());
        for (int i = 1; i <= products.size() - 1; i++) {
            String product = products.get(i);
            System.out.println(String.format("%d. %s", i, product));
        }

        scanner.close();
    }
}