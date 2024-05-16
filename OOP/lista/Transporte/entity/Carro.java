package entity;

public class Carro implements Transporte {

    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    public void frear() {
        System.out.println("Carro freando");   
    }

    public void virar(String direcao) {
        System.out.println("Carro virando para " + direcao);
    }

    public void ligarFarol() {
        System.out.println("Farol ligado");
    }
}
