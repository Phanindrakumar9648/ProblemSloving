package streams;
import java.util.*;
import java.util.stream.*;
public class CityData {

    public static void main(String[] args) {
        List<City> cities = Arrays.asList(
                new City("Delhi", 12000),
                new City("Mumbai", 800000),
                new City("Bangalore", 450000),
                new City("Hyderabad", 1200000),
                new City("Chennai", 60000)
        );

        City result = cities.stream()
                .sorted(Comparator.comparing(City::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(result);

        // Group by first character of name, then max population in each group

        Map<Character, City> results = cities.stream().collect(Collectors.groupingBy(word -> word.getName().charAt(0),Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(City::getSalary)), opt -> opt.orElse(null))));

        results.forEach((k,v) -> System.out.println(k + " -> " + v));

        //Average population of top 3 most populated cities.
        double avg = cities.stream()
                .sorted(Comparator.comparing(City::getSalary).reversed())
                .limit(3)
                .mapToInt(City::getSalary)
                .average()
                .orElse(0);
        System.out.println(avg);

        //Map of population range -> city names
        Map<String, List<String>> range = cities.stream()
                .collect(Collectors.groupingBy(
                        c -> {
                            int s = c.getSalary();
                            if (s < 100000) return "LOW";
                            else if (s < 500000) return "MEDIUM";
                            else return "HIGH";
                        },
                        Collectors.mapping(City::getName, Collectors.toList())
                ));

        range.forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println(range);

        // Using reduce: String of cities ordered by population.
        String order = cities.stream()
                .sorted(Comparator.comparing(City::getSalary).reversed())
                .map(c -> c.getName() + "(" + c.getSalary() + ")")
                .reduce((a, b) -> a + " > " + b)
                .orElse("");
        System.out.println(order);

    }

    static class City {
        private String name;
        private int salary;

        public City(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return name + " - " + salary;
        }
    }
}
