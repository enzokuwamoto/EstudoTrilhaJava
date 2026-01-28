package ZZAcollections.test;

import ZZAcollections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("111", "Pixel");
        Smartphone s2 = new Smartphone("222", "iPhone");
        Smartphone s3 = new Smartphone("333", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        for (Smartphone smartphone : smartphones) {
            System.out.println((smartphone).toString());
        }
        Smartphone s4 = new Smartphone("222", "");

        int indexOf = smartphones.indexOf(s4);
        if(indexOf != -1){
            System.out.println("----");
            System.out.println(smartphones.get(indexOf));
        }
    }
}
