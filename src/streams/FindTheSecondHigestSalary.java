package streams;

import hashmap.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindTheSecondHigestSalary {
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
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(secondSalary ->
                        employees.stream()
                                .filter(emp -> emp.getSalary() == secondSalary)
                                .forEach(emp ->
                                        System.out.println(emp.getSalary() +" "+emp.getDepartment()))

                );

    }
}
