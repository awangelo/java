import java.util.Scanner;

import entity.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Produto prod = new Produto();

        System.out.println("Insira o valor do produto");
        prod.preco = sc.nextDouble();
        System.out.println("Insira + para adicionar e - para remover");
        switch (sc.next().charAt(0)) {
            case '+':
                System.out.println("Insira o n de produtos");
                int x = sc.nextInt();
                prod.addEstoque(x);
                break;
            case '-':
                System.out.println("Insira o n de produtos");
                int y = sc.nextInt();
                prod.removeEstoque(y);
                break;
            default:
                System.out.println("Opcao invalida");
        }
        sc.close();
        
        System.out.println("\nNumero de produtos no estoque: " + prod.estoque);
        System.out.println("Valor do estoque: " + prod.getValorEstoque());
    }
}
