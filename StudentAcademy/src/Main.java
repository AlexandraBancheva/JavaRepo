import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, ArrayList<Double>> gradesStudents = new HashMap<String, ArrayList<Double>>();
        int numberOfActions = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfActions; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!gradesStudents.containsKey(student)) {
                gradesStudents.put(student, new ArrayList<Double>(Arrays.asList(grade)));
            } else {
                gradesStudents.get(student).add(grade);
            }
        }

        for (Map.Entry<String, ArrayList<Double>> entity: gradesStudents.entrySet()) {
            String student = entity.getKey();
            ArrayList<Double> values = entity.getValue();
            double sum = 0;
            int count = values.size();
            for (double grade: values) {
                sum += grade;
            }

            double averageGrade = sum / count;

            System.out.println(String.format("%s -> %.2f", student, averageGrade));
        }
        scanner.close();
    }
}