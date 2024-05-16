import entity.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();
        
        System.out.println("Digite o nome: ");
        usuario.setNome(sc.nextLine());

        System.out.println("Usuario: " + "");
        System.out.println("Escolha uma acao:");
        System.out.println("1 - Alterar email");
        System.out.println("2 - Alterar senha");

        switch (sc.nextInt()) {
            case 1:
                System.out.print("Digite o novo email: ");
                usuario.setEmail(sc.next());
                break;
            case 2:
                System.out.print("Digite a nova senha: ");
                usuario.setSenha(sc.next());
                break;
            default:
                break;
        }
        sc.close();
        System.out.println();
        usuario.getNome();
        usuario.getEmail();
    }
}
