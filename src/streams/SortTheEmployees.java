package streams;

import hashmap.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheEmployees {
    public static void main(String[] args) {
        List<Employee> employees =
                Arrays.asList(
                        new Employee("Ravi", 50000, "IT"),
                        new Employee("Anu", 70000, "HR"),
                        new Employee("Kiran", 60000, "Finance"),
                        new Employee("Sita", 80000, "IT"),
                        new Employee("Mery", 70000, "HR")
                );

        //First sort by department in ascending order (A → Z)
        //If department is same, sort by salary in descending order
        //If salary is also same, sort by name in ascending alphabetical order
        //Return the sorted list
        List<Employee> list = employees.stream().sorted(Comparator.comparing(Employee::getDepartment)
                .thenComparing(Comparator.comparing(Employee::getSalary).reversed()
                        .thenComparing(Employee::getName))).toList();
        list.forEach(System.out::println);
    }
}
