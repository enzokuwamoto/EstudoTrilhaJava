package ZZAcollections.test;

import ZZAcollections.domain.Jogador;

import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class QueueTest01 {
    static void main(String[] args) {
        Queue<Jogador> jogadores = new PriorityQueue<>(new JogadorPriceComparator());

        jogadores.add(new Jogador(4L, "Neymar Jr.", 10, 9.99, 1));
        jogadores.add(new Jogador(3L, "Caça Rato", 7 , 3.99, 0));
        jogadores.add(new Jogador(1L, "Juninho Resenha", 8, 1.99, 0));
        jogadores.add(new Jogador(2L, "Claudio Caneludo", 7, 2.99, 0));
        jogadores.add(new Jogador(5L, "Robert Renan", 3, 2.99, 0));

        while(!jogadores.isEmpty()){
            System.out.println(jogadores.poll());
        }
    }
}
