import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split(" ");

            Employee employee = new Employee();
            employee.setName(input[0]);
            employee.setSalary(Double.parseDouble(input[1]));
            employee.setPosition(input[2]);
            employee.setDepartment(input[3]);
            setAgeOrEmailOrBoth(input, employee);

            employees.add(employee);
        }
        List<String> departmentList = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());

        List<Department> departments = new ArrayList<>();
        for (String department: departmentList) {
            departments.add(new Department(department, employees.stream()
                                                            .filter(employee -> employee.getDepartment().equals(department))
                                                            .collect(Collectors.toList())));
        }
        departments.sort(Comparator.comparingDouble(Department::getAverageSalary).reversed());
        Department department = departments.get(0);
        department.getEmployees().sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        System.out.printf("Highest Average Salary: %s%n", department.getNameDepartment());
        for (Employee employee: department.getEmployees()) {
            System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        }

        scanner.close();
    }

    public static void setAgeOrEmailOrBoth(String[] input, Employee employee){
        switch (input.length){
            case 5:
                if (input[4].contains("@")){
                    employee.setEmail(input[4]);
                } else {
                    employee.setAge(Integer.parseInt(input[4]));
                }
                break;
            case 6:
                if (input[4].contains("@")) {
                    employee.setEmail(input[4]);
                    employee.setAge(Integer.parseInt(input[5]));
                } else {
                    employee.setAge(Integer.parseInt(input[4]));
                    employee.setEmail(input[5]);
                }
                break;
        }
    }
}