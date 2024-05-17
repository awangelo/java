package entity;

public class Produto {
    private String nome;
    private int id;
    private int quantidade;
    private double preco;

    public Produto(String nome, int id, int quantidade, double preco) { // construtor do produto
        this.nome = nome;
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // getters para ver os atributos privados
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDesc() {
        return "Produto: " + nome + ", ID: " + id + ", Quantidade: " + quantidade + ", Preço: " + preco;
    }
}