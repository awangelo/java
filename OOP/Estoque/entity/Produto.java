package entity;

public abstract class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(int id, String nome, int quantidade, double preco) { // construtor do produto
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // getters e setters para os atributos privados
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
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

    public abstract String getDesc(); // nao vai ser chamado aqui
}
