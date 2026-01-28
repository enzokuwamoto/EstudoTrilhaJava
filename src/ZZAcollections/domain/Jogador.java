package ZZAcollections.domain;

import java.util.Objects;

public class Jogador implements Comparable<Jogador> {
    private Long id;
    private String nome;
    private int numeroCamiseta;
    private double price;
    private int quantity;


    public Jogador(long id, String nome, int numeroCamiseta, double price) {
        Objects.requireNonNull(id, "ID must not be null");
        Objects.requireNonNull(id, "Name must not be null");
        this.id = id;
        this.nome = nome;
        this.numeroCamiseta = numeroCamiseta;
        this.price = price;
    }

    public Jogador(Long id, String nome, int numeroCamiseta, double price, int quantity) {
        this(id, nome, numeroCamiseta, price);
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return id == jogador.id && Objects.equals(nome, jogador.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numeroCamiseta=" + numeroCamiseta +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Jogador other) {
        // this | other
        // -1 if this < other
        // 0 if this == other
        // 1 if this > other
        return Double.compare(this.price, other.price);
    }
}

