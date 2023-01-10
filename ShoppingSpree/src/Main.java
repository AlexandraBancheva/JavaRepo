import java.util.*;

public class Main {
    private static Map<String, Person> people = new LinkedHashMap<>();
    private static Map<String, Product> products = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            setPersonOrProduct(scanner, "Person");
            setPersonOrProduct(scanner, "Product");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }

        String command = scanner.nextLine();
        while(!command.contains("END")){
            try{
                String[] input = command.split(" ");
                people.get(input[0]).buyProduct(products.get(input[1]));

            } catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
            command = scanner.nextLine();
        }

        people.values().forEach(System.out::println);
        scanner.close();
    }

    private static void setPersonOrProduct(Scanner scanner, String typeOfClass) {
        String[] inputLine = scanner.nextLine().split(";");
        Arrays.stream(inputLine).map(i -> i.split("=")).forEach(data -> {
            if(typeOfClass.equals("Person")){
                people.put(data[0].trim(), new Person(data[0].trim(), Double.parseDouble(data[1].trim())));
            } else if(typeOfClass.equals("Product")){
                products.put(data[0].trim(), new Product(data[0].trim(), Double.parseDouble(data[1].trim())));
            }
        });
    }
}