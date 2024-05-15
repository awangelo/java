package entity;

public class Tablet extends DispositivoEletronico {
    String modelo = "iPad";
    int tamanhoTela = 10;

    public Tablet() {
        this.marca = "Apple";
        this.anoFabricacao = 2020;
    }

    public void getInfo() {
        System.out.println(utiliza);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tamanho da Tela: " + this.tamanhoTela);
        getSpecs();
    }
}
