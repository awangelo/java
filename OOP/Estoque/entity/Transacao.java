package entity;

import java.util.Date;

public class Transacao {
    private int idTransacao;
    private Produto produto;
    private int quantidade;
    private String tipo; // "entrada" ou "saida" do estoque
    private Date dataTransacao;

    public Transacao(int idTransacao, Produto produto, int quantidade, String tipo, Date dataTransacao) { // construtor da transacao
        this.idTransacao = idTransacao;
        this.produto = produto;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.dataTransacao = dataTransacao;
    }

    // getters para os atributos privados
    public int getIdTransacao() {
        return idTransacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getDataTransacao() {
        return dataTransacao;
    }

    public String getDesc() {
        return "Transacao: " + idTransacao + ", Produto: " + produto.getNome() + ", Quantidade: " + quantidade + ", Tipo: " + tipo + ", Data: " + dataTransacao;
    }
}
