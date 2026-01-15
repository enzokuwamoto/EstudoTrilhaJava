package PersonalProjectMarket.domain;
import PersonalProjectMarket.domain.types.Categoria;
import PersonalProjectMarket.domain.types.Status;

import java.lang.classfile.attribute.CodeAttribute;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Produto {
    private static int nextId = 1;
    private int id;
    private String nome;
    private String descricao;
    private double valor;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
    private Status status;
    private Categoria categoria;



    public Produto(String nome, Categoria categoria, Status status, String descricao, double valor) {
        this.id = nextId++;
        this.nome = nome;
        this.categoria = categoria;
        //this.status = status.getLabel();
        this.descricao = descricao;
        this.valor = valor;
        this.criadoEm = LocalDateTime.now();
        this.atualizadoEm = criadoEm;
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", status='" + status + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", Criado em ='" + criadoEm.format(f) + '\'' +
                ", Atualizado em ='" + atualizadoEm.format(f)  + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }
// metodo para capturar o proximo ID sem criar um objeto
    public static int getNextAvailableId() {
        return nextId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        this.atualizadoEm = LocalDateTime.now();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
        this.atualizadoEm = LocalDateTime.now();
    }

    public Status getStatus() {
        return status;
    }

    private void setStatus(Status status) {
        this.status = status;
        this.atualizadoEm = LocalDateTime.now();
    }

    public void inativarStatus() {
        this.status = Status.INATIVO;
        this.atualizadoEm = LocalDateTime.now();
    }

    public void ativarStatus() {
        this.status = Status.ATIVO;
        this.atualizadoEm = LocalDateTime.now();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
        this.atualizadoEm = LocalDateTime.now();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        this.atualizadoEm = LocalDateTime.now();
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }
}
