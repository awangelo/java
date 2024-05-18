package entity;

public class Transacao {
    private int idTransacao;
    private Produto produto;
    private int quantidade;
    private String tipo; // "entrada" ou "saida" do estoque

    public Transacao(int idTransacao, Produto produto, int quantidade, String tipo) { // construtor da transacao
        this.idTransacao = idTransacao;
        this.produto = produto;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

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

    public String getDesc() {
        return "Transacao: " + idTransacao + ", Produto: " + produto.getNome() + ", Quantidade: " + quantidade + ", Tipo: " + tipo;
    }
}
