package entity;

public class Livro {

    private String titulo;
    private Autor autor;
    private boolean disponivel;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void emprestar() {
        if (!disponivel) {
            System.out.println("Este livro nao esta disponivel");
        } else {
            this.disponivel = false;
        }
    }

    public void devolver() {
        this.disponivel = true;
    }

    public String getDesc() {
        return this.titulo + " - " + this.autor.getNome() + " - " + (this.disponivel ? "Disponivel" : "Indisponivel");
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }
}
