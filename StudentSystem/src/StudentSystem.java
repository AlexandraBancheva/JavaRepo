import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private final Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public Map<String, Student> getStudentsInfo(){
        return this.students;
    }

    public String parseCommand(String[] input) {
        if ("Create".equals(input[0]) && !students.containsKey(input[1])) {
            students.put(input[1], new Student(input));
        } else if ("Show".equals(input[0]) && getStudentsInfo().containsKey(input[1])){
            return students.get(input[1]).toString();
        }
        return null;
    }
}
