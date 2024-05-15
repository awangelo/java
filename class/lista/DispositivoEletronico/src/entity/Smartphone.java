package entity;

public class Smartphone extends DispositivoEletronico {
    String modelo = "Galaxy";
    int tamanhoTela = 7;
    Boolean temNFC = true;
    Boolean bordaInfinita = true;

    public Smartphone() {
        this.marca = "Samsung";
        this.anoFabricacao = 2020;
    }

    public void getInfo() {
        System.out.println(utiliza);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tamanho da Tela: " + this.tamanhoTela);
        System.out.println("Tem NFC: " + this.temNFC);
        System.out.println("Possui borda infinita: " + this.bordaInfinita);
        getSpecs();
    }
}
