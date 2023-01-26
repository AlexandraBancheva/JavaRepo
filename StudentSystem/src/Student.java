public class Student {
    private final String name;
    private final Integer age;
    private final Double grade;

    public Student(String[] data) {
        this.name = data[1];
        this.age = Integer.parseInt(data[2]);
        this.grade = Double.parseDouble(data[3]);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getGrade() {
        return grade;
    }

    public String getGradeInfo(){
        if (getGrade() >= 5.00){
            return "Excellent student.";
        } else if (getGrade() >= 3.50) {
            return "Average student.";
        }
        return "Very nice person.";
    }

    @Override
    public String toString() {
        return String.format("%s is %s years old. %s", getName(), getAge(), getGradeInfo());
    }
}
