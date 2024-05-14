package entity;

public class Produto {
    public String nome = "sorvete";
    public double preco;
    public int estoque = 100;

    public void addEstoque(int x) {
        estoque += x;
    }

    public void removeEstoque(int x) {
        estoque -= x;
    }

    public double getValorEstoque() {
        return preco * estoque;
    }
}
