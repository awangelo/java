package entity;

public class Biblioteca {
    private Livro[] livros;
    private Usuario[] usuarios;
    private int qtdLivros;
    private int qtdUsuarios;

    public Biblioteca() {
        this.livros = new Livro[100];
        this.usuarios = new Usuario[50];
        this.qtdLivros = 0;
        this.qtdUsuarios = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (this.qtdLivros < this.livros.length) {
            this.livros[this.qtdLivros++] = livro;
        } else {
            System.out.println("A biblioteca esta cheia");
        }
    }

    public void removerLivro(Livro livro) {
        for (int i = 0; i < this.qtdLivros; i++) {
            if (livro == this.livros[i]) {
                this.livros[i] = this.livros[--this.qtdLivros];
                this.livros[this.qtdLivros] = null;
                return;
            }
        }
        System.out.println("Livro nao encontrado");
    }

    public void addUsuario(Usuario usuario) {
        if (this.qtdUsuarios < this.usuarios.length) {
            this.usuarios[this.qtdUsuarios++] = usuario;
        } else {
            System.out.println("A biblioteca esta cheia");
        }
    }

    public void removeUsuario(Usuario usuario) {
        for (int i = 0; i < this.qtdUsuarios; i++) {
            if (usuario == this.usuarios[i]) {
                this.usuarios[i] = this.usuarios[--this.qtdUsuarios];
                this.usuarios[this.qtdUsuarios] = null;
                return;
            }
        }
        System.out.println("Usuario nao encontrado");
    }

    public void listLivrosDisponiveis() {
        for (int i = 0; i < this.qtdLivros; i++) {
            if (this.livros[i].isDisponivel()) {
                System.out.println(this.livros[i].getDesc());
            }
        }
    }

    public void listUsuarios() {
        for (int i = 0; i < this.qtdUsuarios; i++) {
            this.usuarios[i].getDesc();
        }
    }
}
