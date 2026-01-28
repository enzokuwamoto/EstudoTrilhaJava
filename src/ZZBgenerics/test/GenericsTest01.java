package ZZBgenerics.test;

import ZZAcollections.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Enzo");

        for (String o : list) {
            System.out.println(o);
        }
        add(list, new Customer("Jiraya"));
    }
    private static void add(List anyList, Customer c){
        anyList.add(c);
    }
}
