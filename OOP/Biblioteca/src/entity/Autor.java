package entity;

public class Autor {
    private String nome;
    private String nacionalidade;
    private int nascimento;

    public Autor(String nome, String nacionalidade, int nascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void getDesc() {
        System.out.println("Nome: " + this.nome + "\nNacionalidade: " + this.nacionalidade + "\nAno de nascimento: " + this.nascimento);
    }
}
