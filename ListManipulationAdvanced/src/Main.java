import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            numbers.add(input);
        }

        // scanner.nextLine();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            String[] lines = line.split(" ");
            String command = lines[0];

            switch (command){
                case "Add":
                    int numForAdd = Integer.parseInt(lines[1]);
                    numbers.add(numForAdd);
                    break;
                case "Remove":
                    int numForRemove = Integer.parseInt(lines[1]);
                    numbers.remove(Integer.valueOf(numForRemove));
                    break;
                case "RemoveAt":
                    int indexForRemove = Integer.parseInt(lines[1]);
                    numbers.remove(indexForRemove);
                    break;
                case "Insert":
                    int valueForAdd = Integer.parseInt(lines[1]);
                    int indexForAdd = Integer.parseInt(lines[2]);
                    numbers.add(indexForAdd, valueForAdd);
                    break;
                case "Contains":
                    int num = Integer.parseInt(lines[1]);
                    System.out.println(ContainsNum(numbers, num));
                    break;
                case "PrintEven":
                    System.out.println(PrintEven(numbers).toString());
                    break;
                case "PrintOdd":
                    System.out.println(PrintOdd(numbers).toString());
                    break;
                case "GetSum":
                    System.out.println(GetSum(numbers));
                    break;
                case "Filter":
                    String condition = lines[1];
                    int number = Integer.parseInt(lines[2]);
                    System.out.println(FilterMethod(condition, number, numbers).toString());
            }
        }

        System.out.println(numbers.toString());

        scanner.close();
    }

    public static String ContainsNum(ArrayList<Integer> numbers, int num){
        String result;
        if (numbers.contains(num)) {
            result = "Yes";
        } else {
            result = "No such number";
        }

        return result;
    }

    public static ArrayList<Integer> PrintEven(ArrayList<Integer> numbers){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i <= numbers.size() - 1; i++) {
            if (numbers.get(i) % 2 == 0) {
                newArray.add(numbers.get(i));
            }
        }
        return newArray;
    }

    public static  ArrayList<Integer> PrintOdd(ArrayList<Integer> numbers){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i <= numbers.size() - 1; i++) {
            if (numbers.get(i) % 2 == 1) {
                newArray.add(numbers.get(i));
            }
        }
        return newArray;
    }

    public static int GetSum(ArrayList<Integer> numbers){
        Integer sum = 0;
        for (int i = 0; i <= numbers.size() - 1; i++) {
            sum += numbers.get(i);
        }
        return  sum;
    }

    public static ArrayList<Integer> FilterMethod(String condition, int num, ArrayList<Integer> list){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        switch (condition){
            case "<":
                for (int i = 0; i <= list.size() - 1; i++) {
                    if (list.get(i) < num) {
                        newArray.add(list.get(i));
                    }
                }
                break;
            case ">":
                for (int i = 0; i <= list.size() - 1; i++) {
                    if (list.get(i) > num) {
                        newArray.add(list.get(i));
                    }
                }
                break;
            case ">=":
                for (int i = 0; i <= list.size() - 1; i++) {
                    if (list.get(i) >= num) {
                        newArray.add(list.get(i));
                    }
                }
                break;
            case "<=":
                for (int i = 0; i <= list.size() - 1; i++) {
                    if (list.get(i) <= num) {
                        newArray.add(list.get(i));
                    }
                }
                break;
        }
        return newArray;
    }
}