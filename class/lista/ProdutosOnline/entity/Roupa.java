package entity;

public class Roupa extends Produto {
    public String cor = "Preto";
    public String material = "Algodao";

    public Roupa() {
        super("Nome da Roupa", 300.00);
    }

    public String getCor() {
        return cor;
    }

    public String getMaterial() {
        return material;
    }
}
