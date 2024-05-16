import java.util.Scanner;

import entity.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Insira o nome da conta: ");
        conta.titular = sc.nextLine();
        System.out.print("Insira o numero da conta: ");
        conta.numero = sc.nextInt();

        System.out.print("Insira a operacao que deseja realizar (s = sacar, d = depositar): ");
        switch (sc.next().charAt(0)) {
            case 's':
                System.out.print("Insira o valor que deseja sacar: ");
                conta.Sacar(sc.nextDouble());
                break;
            case 'd':
                System.out.print("Insira o valor que deseja depositar: ");
                conta.Depositar(sc.nextDouble());
                break;

            default:
                System.out.println("Operacao invalida");
                break;
        }
        System.out.println();
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: " + conta.saldo);
        System.out.println("Numero: " + conta.numero);
        sc.close();
    }
}
