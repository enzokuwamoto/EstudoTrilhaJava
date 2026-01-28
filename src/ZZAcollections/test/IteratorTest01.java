package ZZAcollections.test;

import ZZAcollections.domain.Jogador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    static void main(String[] args) {
        // melhor performance para remover com linkedList
        List<Jogador> jogadores = new LinkedList<>();
        jogadores.add(new Jogador(4L, "Neymar Jr.", 10, 9.99, 1));
        jogadores.add(new Jogador(3L, "Caça Rato", 10, 9.99, 0));
        jogadores.add(new Jogador(1L, "Juninho Resenha", 10, 9.99, 0));
        jogadores.add(new Jogador(2L, "Claudio Caneludo", 10, 9.99, 0));

        Iterator<Jogador> jogadorIterator = jogadores.iterator();
//        while (jogadorIterator.hasNext()) {
//            Jogador jogador = jogadorIterator.next();
//            if (jogador.getQuantity() == 0) {
//                jogadorIterator.remove();
//            }
//        }
        // functional programming
        jogadores.removeIf(jogador -> jogador.getQuantity() == 0);

        System.out.println(jogadores);
    }
}

