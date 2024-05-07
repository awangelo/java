import java.util.Scanner;

public class ArrayNomeMaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N de pessoas: ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        int indiceMaisVelho = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Insira o nome: ");
            nomes[i] = sc.next();
            System.out.print("Insira a idade: ");
            idades[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 1; i < n; i++) {
            if (idades[i] > idades[indiceMaisVelho]) {
                indiceMaisVelho = i;
        }

            }
        System.out.println("Pessoa mais velha: " + nomes[indiceMaisVelho]);
    }
}
