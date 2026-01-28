package ZZGstreams.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest10 {
    static void main(String[] args) {
        Stream.iterate(new int[] {0,1}, a -> new int[]{a[1], a[0]+a[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));
    }
}
