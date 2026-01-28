package ZZAcollections.test;

import ZZAcollections.domain.Jogador;
import ZZAcollections.domain.Smartphone;

import java.util.*;

class SmartphoneNameComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class JogadorPriceComparator implements Comparator<Jogador>{

    @Override
    public int compare(Jogador o1, Jogador o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneNameComparator());
        set.add(new Smartphone("111", "LG"));
        set.add(new Smartphone("111", "LG"));
        for (Smartphone smartphone : set) {
            System.out.println(smartphone);
        }


        NavigableSet<Jogador> jogadores = new TreeSet<>(new JogadorPriceComparator());
        jogadores.add(new Jogador(4L, "Neymar Jr.", 10, 9.99, 1));
        jogadores.add(new Jogador(3L, "Caça Rato", 7 , 3.99, 0));
        jogadores.add(new Jogador(1L, "Juninho Resenha", 8, 1.99, 0));
        jogadores.add(new Jogador(2L, "Claudio Caneludo", 7, 2.99, 0));
        jogadores.add(new Jogador(5L, "Robert Renan", 3, 2.99, 0));
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
        Jogador phGanso = new Jogador(6L, "PH Ganso",10,3.97, 0);
        System.out.println("------");
        System.out.println(jogadores.lower(phGanso));
    }
}
