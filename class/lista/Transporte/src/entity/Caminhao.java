package entity;

public class Caminhao implements Transporte {

    public void acelerar() {
        System.out.println("Caminhao acelerando");
    }

    public void frear() {
        System.out.println("Caminhao freando");
    }

    public void virar(String direcao) {
        System.out.println("Caminhao virando " + direcao);
    }

    public void verificarRodas() {
        System.out.println("Verificando as rodas");
    }
}
