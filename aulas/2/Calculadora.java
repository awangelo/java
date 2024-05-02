import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o segundo segundo: ");
        double y = scanner.nextDouble();

        System.out.println("Escolha a operacao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Divisao");
        System.out.println("4 - Multiplicacao");
        int operacao = scanner.nextInt();

        double resultado = 0;
        switch (operacao) {
            case 1:
                resultado = x + y;
                break;
            case 2:
                resultado = x - y;
                break;
            case 3:
                if (y != 0)
                {
                    resultado = x / y;
                }
                else
                {
                    System.out.println("Nao existe dividir por zero.");
                    return;
                }
                break;
            case 4:
                resultado = x * y;
                break;
            default:
                System.out.println("Codigo de operação invalido.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
