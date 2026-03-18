package streams;

import hashmap.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployeesWithAgeGreaterThan25 {
    public static void main(String[] args) {

        List<Employee> employeeList =   Arrays.asList(
                new Employee("Phani", 26, "IT"),
                new Employee("Anu", 6, "HR"),
                new Employee("Ram", 1, "Finance"),
                new Employee("Sita", 2, "IT"),
                new Employee("Mery", 26, "HR")
        );
            //emp.getSalary() is  worng filed instead  of that we need use getAge if there
        employeeList.stream().filter(emp -> emp.getSalary()>25)
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
