package entity;

public class Notebook extends DispositivoEletronico {
    String modelo = "XPS";
    String processador = "i7";
    int memoriaRam = 16;
    int tamanhoTela = 15;
    int numeroTeclas = 120;

    public Notebook() {
        this.marca = "Dell";
        this.anoFabricacao = 2020;
    }

    public void getInfo() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Processador: " + this.processador);
        System.out.println("Memória RAM: " + this.memoriaRam);
        System.out.println("Tamanho da Tela: " + this.tamanhoTela);
        System.out.println("Número de Teclas: " + this.numeroTeclas);
        getSpecs();
    }
}
