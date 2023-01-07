import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int numbersOfInput = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersOfInput; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            persons.add(new Person(inputLine[0], Integer.parseInt(inputLine[1])));
        }

        List<Person> soretedList = persons.stream().filter(a -> a.getAge() >= 30).toList();

        for (Person person: soretedList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }


        scanner.close();
    }
}