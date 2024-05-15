import java.util.Scanner;

import entity.Eletronico;
import entity.Livro;
import entity.Roupa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Eletronico eletronico = new Eletronico();
        Livro livro = new Livro();
        Roupa roupa = new Roupa();

        System.out.println("Escolha um produto: ");
        System.out.println("1 - Livro");
        System.out.println("2 - Roupa");
        System.out.println("3 - Eletronico");

        switch (sc.nextInt()) {
            case 1:
                System.out.println(livro.getNome());
                System.out.println(livro.getPreco());
                System.out.println(livro.getAutor());
                System.out.println(livro.getNumeroPaginas());
                break;
            case 2:
                System.out.println(roupa.getNome());
                System.out.println(roupa.getPreco());
                System.out.println(roupa.getCor());
                System.out.println(roupa.getMaterial());
                break;
            case 3:
                System.out.println(eletronico.getNome());
                System.out.println(eletronico.getPreco());
                System.out.println(eletronico.getVoltagem());
                System.out.println(eletronico.getMarca());
                break;
        }
        sc.close();
    }
}
