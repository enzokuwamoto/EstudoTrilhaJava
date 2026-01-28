package ZZAcollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(6);
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);

        //idx 0,1,2,3
        //value 0,2,3,4
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 0));
    }
}
