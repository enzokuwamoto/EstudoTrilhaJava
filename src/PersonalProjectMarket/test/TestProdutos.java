package PersonalProjectMarket.test;

import PersonalProjectMarket.domain.Produto;
import PersonalProjectMarket.domain.types.Categoria;
import PersonalProjectMarket.domain.types.Status;

import java.util.Scanner;

public class TestProdutos {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número de produtos que serão cadastradas:");
        int numeroDePessoas = Integer.parseInt(in.nextLine());
        System.out.println(numeroDePessoas);

        // como rodar um for aqui para adicionar mais de um produto por vez? - w/ chat

        // implementar set.categoria mais facilitado, como fiz com o status, pré definindo as opções? - w/ chat

        // reportValue - retonar "Bazar" ao invés de "BAZAR" - aulinha de hoje

        // implementar enumeration overriding para desconto no pagamento (débito, crédito, app?) - ideia w/ chat

        Produto produto1 = new Produto("Doritos 22g", Categoria.BAZAR,Status.ATIVO, "Salgadinho de tortilla", 3);
        Produto produto2 = new Produto("Coca Cola 2l", Categoria.BEBIDAS,Status.ATIVO, "Bebida gaseificada de cola", 11.40);
        System.out.println(produto1);
        System.out.println(produto2);
    }
}
