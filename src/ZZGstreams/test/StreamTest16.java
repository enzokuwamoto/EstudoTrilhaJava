package ZZGstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamRangedClose(num);
        sumParallelLongStreamRangedClose(num);
    }
    private static void sumFor(long num){
        System.out.println("sumFor");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i ++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result+" " + (end - init) + "ms");
    }
    private static void sumStreamIterate(long num){
        System.out.println("sumStreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+" " + (end - init) + "ms");
    }
    private static void sumParallelStreamIterate(long num){
        System.out.println("sumParallelStreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+" " + (end - init) + "ms");
    }
    private static void sumLongStreamRangedClose(long num){
        System.out.println("sumLongStreamRangedClose");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+" " + (end - init) + "ms");
    }
    private static void sumParallelLongStreamRangedClose(long num){
        System.out.println("sumParallelLongStreamRangedClose");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+" " + (end - init) + "ms");
    }
}
