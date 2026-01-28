package ZZAcollections.test;

import ZZAcollections.domain.Jogador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    static void main(String[] args) {
        JogadorByTitleComparator jogadorByTitleComparator = new JogadorByTitleComparator();
        List<Jogador> jogadores = new ArrayList<>(6);
        jogadores.add(new Jogador(4L, "Neymar Jr.", 10, 999.99));
        jogadores.add(new Jogador(3L, "Caça Rato", 10, 1.99));
        jogadores.add(new Jogador(1L, "Juninho Resenha", 10, 2.99));
        jogadores.add(new Jogador(2L, "Claudio Caneludo", 10, 2.87));

        // Collections.sort(jogadores); // sorting by price
        jogadores.sort(jogadorByTitleComparator);

        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
        System.out.println("------------");
        Jogador jogadorToSearch = new Jogador(4L, "eymar Jr.", 10, 9.99);
        System.out.println(Collections.binarySearch(jogadores, jogadorToSearch, jogadorByTitleComparator));
    }
}
