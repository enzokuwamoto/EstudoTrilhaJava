package ZZGstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    static void main(String[] args) {
        List<String> words = List.of("Gomu", "omu", "No", "MI");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String> collect = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
