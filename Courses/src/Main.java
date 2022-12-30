import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> coursesWithStudents = new HashMap<String, ArrayList<String>>();
        String inputs = scanner.nextLine();

        while (!inputs.equals("end")) {
            String[] inputLine = inputs.split(" : ");
            String course = inputLine[0];
            String student = inputLine[1];
            if (!coursesWithStudents.containsKey(course)) {
                coursesWithStudents.put(course, new ArrayList<String>(Arrays.asList(student)));
            } else {
                coursesWithStudents.get(course).add(student);
            }
            inputs = scanner.nextLine();
        }

//        TreeMap<String, ArrayList<String>> sortedDict = new TreeMap<String, ArrayList<String>();
        for (Map.Entry<String, ArrayList<String>> entity: coursesWithStudents.entrySet()) {
            String key = entity.getKey();
            ArrayList<String> values = entity.getValue();
            int countOfStudents = values.size();

            System.out.println(String.format("%s : %d", key, countOfStudents));

            for (String student: values) {
                System.out.println(String.format("-- %s", student));
            }
        }
        scanner.close();
    }
}