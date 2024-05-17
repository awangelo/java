import entity.*;

public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro("O Hobbit", new Autor("J.R.R. Tolkien", "Inglaterra", 1892));
        Livro livro2 = new Livro("Harry Potter", new Autor("J.K. Rowling", "Reino Unido", 1965));
        Livro livro3 = new Livro("Inferno", new Autor("Dante Alighieri", "Italia", 1265));

        Usuario usuario = new Usuario("Alice", 001);
        Usuario usuario2 = new Usuario("Arthur", 002);

        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.addUsuario(usuario);
        biblioteca.addUsuario(usuario2);
        System.out.println("Dados iniciais: ");
        biblioteca.listLivrosDisponiveis();
        biblioteca.listUsuarios();
        System.out.println();

        usuario.emprestarLivro(livro);
        System.out.println("Dados depois de emprestado: ");
        biblioteca.listLivrosDisponiveis();
        usuario.getDesc();
        System.out.println();

        usuario.devolverLivro(livro);
        System.out.println("Dados depois de devolvido: ");
        biblioteca.listLivrosDisponiveis();
        usuario.getDesc();
        System.out.println();
        System.out.println("Dados depois do usuario removido: ");
        biblioteca.removeUsuario(usuario);
        biblioteca.listUsuarios();
    }
}
