package produtos;

import entity.Produto;

public class Roupa extends Produto {
    private String material;
    private String marca;

    public Roupa(int id, String nome, int quantidade, double preco, String material, String marca) {
        super(id, nome, quantidade, preco);
        this.material = material;
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getDesc() {
        return "Produto: " + getNome() + ", ID: " + getId() + ", Quantidade: " + getQuantidade() + ", Preço: " + getPreco() + ", Material: " + material + ", Marca: " + marca;
    }
}
