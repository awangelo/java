package entity;

public class Estoque {
    private Produto[] produtos;
    private Transacao[] transacoes;
    private int produtoCount;
    private int transacaoCount;

    public Estoque(int capacidadeProdutos, int capacidadeTransacoes) { // construtor do estoque
        this.produtos = new Produto[capacidadeProdutos];
        this.transacoes = new Transacao[capacidadeTransacoes];
        this.produtoCount = 0;
        this.transacaoCount = 0;
    }

    // adcionar metodos para as acoes
}