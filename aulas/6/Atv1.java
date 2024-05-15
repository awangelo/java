import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ele[] = new int[7];

        System.out.print("Insira o numero a ser adicionado: ");
        int n = sc.nextInt();

        ele[0] += n;
        ele[6] += n;

        for (int i = 0; i < ele.length; i++) {
            System.out.println(ele[i]);
        }

        sc.close();
    }
}
