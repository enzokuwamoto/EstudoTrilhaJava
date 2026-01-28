package ZZAcollections.test;

import ZZAcollections.domain.Customer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    static void main(String[] args) {
        Customer customer = new Customer("Enzo Kuwamoto");
        NavigableMap<String, Customer> map = new TreeMap<>();
        map.put("a",customer);

        for(Map.Entry<String, Customer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();
    }
}
