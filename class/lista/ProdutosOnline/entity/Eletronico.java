package entity;

public class Eletronico extends Produto {
    public String marca = "Samsung";
    public int voltagem = 220;

    public Eletronico() {
        super("Tablet", 1000.00);
    }

    public String getMarca() {
        return marca;
    }

    public int getVoltagem() {
        return voltagem;
    }
}
