import java.util.Scanner;

public class Ano_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();
        sc.close();

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println("O ano eh bissexto.");
        }
        else {
            System.out.println("O ano nao eh bissexto.");
        }
    }
}