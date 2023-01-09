import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        CustomList<String> box = new CustomList<>();

        while (!input.contains("END")){
            String[] line = input.split(" ");
            executeOperation(line, box);
            input = scanner.nextLine();
        }
        scanner.close();
    }

    public static void executeOperation(String[] line, CustomList<String> box){
        String operation = line[0];

        switch (operation){
            case "Add":
                box.add(line[1]);
                break;
            case "Remove":
                box.remove(Integer.parseInt(line[1]));
                break;
            case "Contains":
                System.out.println(box.contains(line[1]));
                break;
            case "Swap":
                box.swap(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
                break;
            case "Greater":
                System.out.println(box.countGreaterThan(line[1]));
                break;
            case "Max":
                System.out.println(box.getMax());
                break;
            case "Min":
                System.out.println(box.getMin());
                break;
            case "Print":
                box.printList();
                break;
        }
    }
}