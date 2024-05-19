import java.util.Scanner;
import java.util.Locale;
import entity.*;
import produtos.*;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque();

        System.out.println("Sistema de Estoque!");
        System.out.println(
                "O primeiro uso desse sistema possui o estoque zerado, ou seja, deve-se adicionar os produtos antes para poder utilizar das funcionalidades.");
        int escolha;
        do {
            System.out.println("Selecione uma funcionalidade do menu principal:");
            System.out.println("1- Realizar transações de estoque");
            System.out.println("2- Consulta de estoque");
            System.out.println("3- Gerenciamento de produtos");
            System.out.println("Digite -1 para sair do programa");

            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    realizarTransacao(sc, estoque);
                    break;
                case 2:
                    consultarEstoque(sc, estoque);
                    break;
                case 3:
                    gerenciarProduto(sc, estoque);
                    break;
                case -1:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (escolha != -1);
        sc.close();
    }

    private static void realizarTransacao(Scanner sc, Estoque estoque) {
        System.out.println("ID da transação: ");
        int idTransacao = sc.nextInt();
        System.out.println("ID do produto: ");
        int idProduto = sc.nextInt();
        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine(); // limpa \n
        System.out.println("Tipo de Transação (entrada/saida): ");
        String tipo = sc.nextLine();

        Produto produto = estoque.consultarProduto(idProduto); // cria o objeto do produto pra condicao
        if (produto != null) { // se o produto existir
            estoque.realizarTransacao(idTransacao, produto, quantidade, tipo);
            System.out.println("Transação realizada com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void consultarEstoque(Scanner sc, Estoque estoque) {
        System.out.println("ID do produto: ");
        int idProduto = sc.nextInt();

        Produto produto = estoque.consultarProduto(idProduto);
        if (produto != null) {
            System.out.println(produto.getDesc());
        } else {
            System.out.println("Produto nao encontrado.");
        }
    }

    private static void gerenciarProduto(Scanner sc, Estoque estoque) {
        System.out.println("Selecione o tipo do produto que você deseja gerenciar:");
        System.out.println("1- Comida");
        System.out.println("2- Eletronico");
        System.out.println("3- Roupa");

        int tipoDoProduto = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o ID do produto:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine();
        System.out.println("Digite a quantidade do produto:");
        int quantidade = sc.nextInt();
        System.out.println("Digite o preco do produto:");
        double preco = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a marca do produto que deseja adicionar:");
        String marca = sc.nextLine();

        switch (tipoDoProduto) {
            case 1:
                System.out.println("Voce deseja 1-adicionar ou 2-remover?:");

                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Digite o peso do produto que deseja adicionar:");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        Comida comida = new Comida(id, nome, quantidade, preco, peso, marca);
                        estoque.adicionarProduto(comida);
                        System.out.println(
                                "Comida adicionada! Ultilize o sistema de transações, consultas e gerenciamento para modifica-la");
                        break;
                    case 2:
                        Produto produto = estoque.consultarProduto(id);
                        if (produto != null) {
                            estoque.removerProduto(id);
                            System.out.println("Comida removida! Ultilize o sistema de gerenciamento para adicionar uma nova");
                        } else {
                            System.out.println("Produto nao encontrado.");
                        }
                        break;
                    default:
                        System.out.println("Nenhuma opcao escolhida!");
                        break;
                }
                break;

            case 2:
                System.out.println("Voce deseja 1-adicionar ou 2-remover?:");

                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Digite o modelo do produto que deseja adicionar:");
                        String modelo = sc.next();
                        sc.nextLine();
                        
                        Eletronico eletronico = new Eletronico(id, nome, quantidade, preco, marca, modelo);
                        estoque.adicionarProduto(eletronico);
                        System.out.println("Eletronico adicionado! Ultilize o sistema de transações, consultas e gerenciamento para modifica-la");
                        break;
                    case 2:
                        Produto produto = estoque.consultarProduto(id);
                        if (produto != null) {
                            estoque.removerProduto(id);
                            System.out.println("Eletronico removido! Ultilize o sistema de gerenciamento para adicionar um novo");
                        } else {
                            System.out.println("Produto nao encontrado.");
                        }
                        break;
                    default:
                        System.out.println("Nenhuma opcao escolhida!");
                        break;
                }
                break;
            case 3:
                System.out.println("Voce deseja 1-adicionar ou 2-remover?:");

                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Digite o material do produto que deseja adicionar:");
                        String material = sc.next();
                        sc.nextLine();

                        Roupa roupa = new Roupa(id, nome, quantidade, preco, material, marca);
                        estoque.adicionarProduto(roupa);
                        System.out.println(
                                "Roupa adicionada! Ultilize o sistema de transações, consultas e gerenciamento para modifica-la");
                        break;
                    case 2:
                        Produto produto = estoque.consultarProduto(id);
                        if (produto != null) {
                            estoque.removerProduto(id);
                            System.out.println(
                                    "Comida removida! Ultilize o sistema de gerenciamento para adicionar uma nova");
                        } else {
                            System.out.println("Produto nao encontrado.");
                        }
                        break;
                    default:
                        System.out.println("Nenhuma opcao escolhida!");
                        break;
                }
                break;
        }
    }
}
