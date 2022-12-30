import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> coursesWithStudents = new HashMap<String, ArrayList<String>>();
        String inputs = scanner.nextLine();

        while (inputs.equals("end")) {
            String[] inputLine = inputs.split(" : ");
            String course = inputLine[0];
            String student = inputLine[1];
            if (!coursesWithStudents.containsKey(course)) {

            }
        }


        scanner.close();
    }
}