package streams;

import hashmap.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java 8 program to convert a list of employees into a map (name as
//key and department as value).
public class ConvertListEmployeesIntoAMap {
    public static void main(String[] args) {

        List<Employee> employees =
                Arrays.asList(
                        new Employee("Ravi", 50000, "IT"),
                        new Employee("Anu", 70000, "HR"),
                        new Employee("Kiran", 60000, "Finance"),
                        new Employee("Sita", 80000, "IT"),
                        new Employee("Mery", 70000, "HR")
                );

        employees.stream().collect(Collectors.toMap(Employee::getName,Employee::getDepartment))
                .forEach((name,dept) -> System.out.println(name +'-'+ dept));

    }
}
