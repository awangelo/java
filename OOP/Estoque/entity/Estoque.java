package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>(); // cria um arraylist para os produtos
    private List<Transacao> transacoes = new ArrayList<>(); // cria um arraylist para as transacoes

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void atualizarProduto(Produto produtoAtualizado) {
        for (Produto p : produtos) { // percorre todos os elementos do arraylist de produtos
            if (p.getId() == produtoAtualizado.getId()) { // verifica se o id do produto passado eh igual ao id do produto nova
                p.setQuantidade(produtoAtualizado.getQuantidade());
                p.setPreco(produtoAtualizado.getPreco());
                break;
            }
        }
    }

    public void removerProduto(int idProduto) {
        Produto produtoParaRemover = null; // vai armazenar o produto a ser removido
        for (Produto produto : produtos) {
            if (produto.getId() == idProduto) {
                produtoParaRemover = produto; // armazena o produto a ser removido
                break;
            }
        }
        if (produtoParaRemover != null) { // se tiver um produto para remover
            produtos.remove(produtoParaRemover);
        }
    }

    public Produto consultarProduto(int idProduto) {
        for (Produto p : produtos) {
            if (p.getId() == idProduto) {
                return p; // retorna o produto se o id for igual
            }
        }
        return null; // se nenhum produto for encontrado
    }

    public void realizarTransacao(int idTransacao, Produto produto, int quantidade, String tipo) {
        if (tipo.equals("entrada")) {
            produto.setQuantidade(produto.getQuantidade() + quantidade);
        } else if (tipo.equals("saida") && produto.getQuantidade() >= quantidade) { // se for saida e tiver quantidade suficiente
            produto.setQuantidade(produto.getQuantidade() - quantidade); // remove a quantidade
        } else {
            System.out.println("Transacao inválida.");
            return;
        }
        Transacao transacao = new Transacao(idTransacao, produto, quantidade, tipo, new Date()); //cria uma nova transacao
        transacoes.add(transacao);
    }

    public void exibirEstoque() {
        for (Produto p : produtos) {
            System.out.println(p.getDesc());
        }
    }
}