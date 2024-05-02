import java.util.Scanner;

public class Diferenca
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 4 numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int dif = (a * b - c * d);

        System.out.printf("Diferenca: %d", dif);
    }
}