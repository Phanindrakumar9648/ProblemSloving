package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsByLength {
    public static void main(String[] args) {
        List<String> str = Arrays.asList(
                "phani","kumar","mery","pavan","varama","nani","nagendra");
        String collect = str.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
