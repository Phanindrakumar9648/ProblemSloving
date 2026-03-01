package streams;

import hashmap.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        List<Employee> employees =
                Arrays.asList(
                        new Employee("Ravi", 50000, "IT"),
                        new Employee("Anu", 70000, "HR"),
                        new Employee("Kiran", 60000, "Finance"),
                        new Employee("Sita", 80000, "IT"),
                        new Employee("Mery", 70000, "HR")
                );

        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((dept, empList) -> {
            System.out.println(dept + " -> " + empList);
        });
    }
}
