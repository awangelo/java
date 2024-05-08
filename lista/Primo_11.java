import java.util.Scanner;

public class Tabuada_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um numero: ");
		int n = sc.nextInt();
		sc.close();
			
		if (ehPrimo(n)) {
			System.out.println("Eh primo");
		}
		else {
			System.out.println("Nao eh primo");
		}
	}
	
	static boolean ehPrimo(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
