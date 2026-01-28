package ZZGstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Jorge", "Roberto", "Ferreira");
        List<String> developers = List.of("Claudio", "Robson", "Wilgner");
        List<String> students = List.of("Enzo", "William", "Leonardo");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("-----------------");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }

}
