import java.util.Scanner;
import java.lang.Math;

public class PrimosMenores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um numero inteiro: ");
		int numero = sc.nextInt();
		sc.close();
		
		while (numero>2) {
			boolean ehPrimo = true;
			
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					ehPrimo = false;
					break;
				}
			}
			
			if (ehPrimo) {
				System.out.println(numero);
			}
			
			numero--;
		}
	}
}
