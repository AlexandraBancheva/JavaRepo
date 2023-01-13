import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Identifiable> ids = new ArrayList<>();

        String input = scanner.nextLine();

        while(!input.contains("End")){
            String[] line = input.split(" ");
            ids.add(line.length == 3
                    ? new Citizen(line[0], Integer.parseInt(line[1]), line[2])
                    : new Robot(line[0], line[1]));

            input = scanner.nextLine();
        }
        String fakeIds = scanner.nextLine();

        for (Identifiable id : ids) {
            System.out.printf("%s", id.getId().endsWith(fakeIds) ? id.getId() + System.lineSeparator() : "");
        }

        scanner.close();
    }
}