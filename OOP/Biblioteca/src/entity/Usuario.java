package entity;

public class Usuario {
    private String nome;
    private int id;
    private Livro[] livrosEmprestados;
    private int qtdLivrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new Livro[10];
        this.qtdLivrosEmprestados = 0;
    }

    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel() && this.qtdLivrosEmprestados < this.livrosEmprestados.length) {
            System.out.println("Livro emprestado");
            this.livrosEmprestados[this.qtdLivrosEmprestados++] = livro;
            livro.emprestar();
        } else if (!livro.isDisponivel()) {
            System.out.println("Este livro nao esta disponivel");
        } else {
            System.out.println("Devolva um livro antes de pegar outro");
        }
    }

    public void devolverLivro(Livro livro) {
        for (int i = 0; i < this.qtdLivrosEmprestados; i++) {
            if (livro == this.livrosEmprestados[i]) {
                this.livrosEmprestados[i] = this.livrosEmprestados[--this.qtdLivrosEmprestados];
                this.livrosEmprestados[this.qtdLivrosEmprestados] = null;
                livro.devolver();
                return;
            }
        }
        System.out.println("Esse livro nao foi emprestado");
    }

    public void getDesc() {
        System.out.println("Nome: " + this.nome + " - ID: " + this.id);
        System.out.println("Livros emprestados: ");
        for (int i = 0; i < this.qtdLivrosEmprestados; i++) {
            System.out.println(this.livrosEmprestados[i].getDesc());
        }
    }
}
