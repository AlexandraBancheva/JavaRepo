import java.util.ArrayList;
import java.util.List;

public class Department {
    String nameDepartment;
    List<Employee> employees;
    double averageSalary;

    public Department(String name, List<Employee> employees){
        this.nameDepartment = name;
        this.employees = employees;
        this.averageSalary = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public double getAverageSalary() {
        return averageSalary;
    }
}
