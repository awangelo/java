package entity;

public class Mamifero extends Animal {
    private String tipoPelo;

    public Mamifero(String nome, int idade, String tipoPelo) {
        super(nome, idade);
        this.tipoPelo = tipoPelo;
    }

    public void amamentar() {
        System.out.println("O mamifero esta amamentando.");
    }
}
