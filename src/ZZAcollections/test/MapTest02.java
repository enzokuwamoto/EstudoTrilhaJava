package ZZAcollections.test;

import ZZAcollections.domain.Customer;
import ZZAcollections.domain.Jogador;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    static void main(String[] args) {
        Customer c1 = new Customer("Jorge Amado");
        Customer c2 = new Customer("Robert Renan");
        System.out.println(c1);
        System.out.println(c2);

        Jogador jogador1 = new Jogador(4L, "Neymar Jr.", 10, 999.99);
        Jogador jogador2 =new Jogador(3L, "Caça Rato", 10, 1.99);
        Jogador jogador3 =new Jogador(1L, "Juninho Resenha", 10, 2.99);
        Jogador jogador4 =new Jogador(2L, "Claudio Caneludo", 10, 2.87);

        Map<Customer, Jogador> customerPlayerMap = new HashMap<>();
        customerPlayerMap.put(c1, jogador2);
        customerPlayerMap.put(c2, jogador4);

        for (Map.Entry<Customer,Jogador> entry: customerPlayerMap.entrySet()){
            System.out.println(entry.getKey().getName() + " : " + entry.getValue().getNome());
        }
    }
}
