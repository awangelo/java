package produtos;

import entity.Produto;

public class Comida extends Produto {
    private double peso;
    private String marca;

    public Comida(int id, String nome, int quantidade, double preco, double peso, String marca) {
        super(id, nome, quantidade, preco);
        this.peso = peso;
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getDesc() {
        return "Produto: " + getNome() + ", ID: " + getId() + ", Quantidade: " + getQuantidade() + ", Preço: " + getPreco() + ", Peso líquido: " + peso + ", Marca: " + marca;
    }
}
