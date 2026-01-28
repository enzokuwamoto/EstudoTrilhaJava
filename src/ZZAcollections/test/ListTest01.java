package ZZAcollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("Enzo");
        names.add("DevDojo Academy");
        for (Object name : names) {

            System.out.println(name );
        }
        System.out.println("-----");
        System.out.println(names.remove(1));
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i ));
        }
    }
}
