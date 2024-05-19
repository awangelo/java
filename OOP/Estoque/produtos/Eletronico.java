package produtos;

import entity.Produto;

public class Eletronico extends Produto {
    private String marca;
    private String modelo;

    public Eletronico(int id, String nome, int quantidade, double preco, String marca, String modelo) {
        super(id, nome, quantidade, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getDesc() {
        return "Produto: " + getNome() + ", ID: " + getId() + ", Quantidade: " + getQuantidade() + ", Preço: " + getPreco() + ", Marca: " + marca + ", Modelo: " + modelo;
    }
}
