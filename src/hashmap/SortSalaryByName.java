package hashmap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortSalaryByName {

    public static void main(String[] args) {

        List<Employee> employees  =
                Arrays.asList(
                        new Employee("Ravi", 50000, "IT"),
                        new Employee("Anu", 70000, "HR"),
                        new Employee("Kiran", 60000, "Finance"),
                        new Employee("Sita", 80000, "IT"),
                        new Employee("Mery", 70000, "HR")
                );

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
                .forEach(emp-> System.out.println(emp.getSalary() +
                        " - " + emp.getName()));


    }
}
