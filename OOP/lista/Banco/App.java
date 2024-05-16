import entity.ContaCorrente;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();
        System.out.println("Escolha uma acao: ");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        int opc = sc.nextInt();

        if (opc == 1) {
            System.out.println("Valor: ");
            conta.depositar(sc.nextDouble());
        } else if (opc == 2) {
            System.out.println("Valor: ");
            conta.sacar(sc.nextDouble());
        }
        sc.close();
    }
}
