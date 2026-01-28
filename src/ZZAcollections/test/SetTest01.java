package ZZAcollections.test;

import ZZAcollections.domain.Jogador;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    static void main(String[] args) {
        Set<Jogador> jogadores = new HashSet<>();
        jogadores.add(new Jogador(4L, "Neymar Jr.", 10, 9.99, 1));
        jogadores.add(new Jogador(3L, "Caça Rato", 10, 9.99, 0));
        jogadores.add(new Jogador(1L, "Juninho Resenha", 10, 9.99, 0));
        jogadores.add(new Jogador(2L, "Claudio Caneludo", 10, 9.99, 0));
    }
}
