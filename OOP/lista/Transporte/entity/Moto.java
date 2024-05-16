package entity;

public class Moto implements Transporte {

    public void acelerar() {
        System.out.println("Moto acelerando");
    }

    public void frear() {
        System.out.println("Moto freando");
    }

    public void virar(String direcao) {
        System.out.println("Moto virando " + direcao);
    }

    public void darGrau() {
        System.out.println("Dando grau");
    }
}
