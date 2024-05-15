package entity;

public class Reptil extends Animal {
    private boolean venenoso;

    public Reptil(String nome, int idade, boolean venenoso) {
        super(nome, idade);
        this.venenoso = venenoso;
    }

    public void tomarSol() {
        System.out.println("O raptil esta tomando sol.");
    }
}