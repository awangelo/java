package entity;

public class Ave extends Animal {
    private int numeroAsas;

    public Ave(String nome, int idade, int numeroAsas) {
        super(nome, idade);
        this.numeroAsas = numeroAsas;
    }

    // Métodos específicos de Ave
    public void voar() {
        System.out.println("A ave esta voando.");
    }
}