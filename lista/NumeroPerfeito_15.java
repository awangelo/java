import java.util.Scanner;

public class NumeroPerfeito_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um numero: ");
		int n = sc.nextInt();
		sc.close();
		
		if (perfeito(n)) {
			System.out.println("O numero eh perfeito");
		}
		else {
			System.out.println("O numero nao eh perfeito");
		}
	}
	
	static boolean perfeito(int n) {
		int soma = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				soma += i;
				if (soma == n) {
					return true;
				}
			}
		}
		return false;
	}
}
