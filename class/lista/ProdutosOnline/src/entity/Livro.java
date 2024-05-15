package entity;

public class Livro extends Produto {
    public String autor = "Autor Exemplo";
    public int numeroPaginas = 100;

    public Livro() {
        super("Nome do Livro", 100.00);
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
