import java.util.Scanner;

public class ForLinhas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor de n: ");
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d \t %d \t %d\n", i, i*i, i*i*i);
		}
	}
}
