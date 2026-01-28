package ZZAcollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    static void main(String[] args) {
        List<String> jogadores = new ArrayList<>();
        jogadores.add("Neymar Jr.");
        jogadores.add("Lionel Messi");
        jogadores.add("Cristiano Ronaldo");
        Collections.sort(jogadores);
        for (String jogador : jogadores) {
            System.out.println(jogador);
        }

        List<Double> values = new ArrayList<>();
        values.add(110.21);
        values.add(21.21);
        values.add(23.098);
        values.add(98.91);
        System.out.println(values);
        Collections.sort(values);
        System.out.println(values);
    }
}
