package ZZAcollections.test;

import ZZAcollections.domain.Jogador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class JogadorByTitleComparator implements Comparator<Jogador>{
    @Override
    public int compare(Jogador jogador1, Jogador jogador2) {
        return jogador1.getNome().compareTo(jogador2.getNome());
    }
}

public class JogadorTest01 {
    static void main(String[] args) {
        List<Jogador> jogadores = new ArrayList<>(6);
        jogadores.add(new Jogador(4L, "Neymar Jr.", 10, 9.99));
        jogadores.add(new Jogador(3L, "Caça Rato", 10, 9.99));
        jogadores.add(new Jogador(1L, "Juninho Resenha", 10, 9.99));
        jogadores.add(new Jogador(2L, "Claudio Caneludo", 10, 9.99));

        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
        // modificação e implemetanção do compareTo na classe jogador
        System.out.println("-----------");
        Collections.sort(jogadores);
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
        // sorteando em ordem alfabética o nome do jogador
        System.out.println("----------");
        //Collections.sort(jogadores, new JogadorByTitleComparator());
        jogadores.sort(new JogadorByTitleComparator());
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }


    }
}
