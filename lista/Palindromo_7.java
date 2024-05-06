import java.util.Scanner;

public class Palindromo_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palavra = sc.next();
		sc.close();
		
		palavra = palavra.toLowerCase();
		int direita = palavra.length() - 1;
		int esquerda = 0;
		boolean palind = true;
		
		while (esquerda < direita) {
			if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
				palind = false;
				break;
			}
			esquerda++;
			direita--;
		}
		
		if (palind) {
			System.out.println("Eh palindromo");
		}
		else {
			System.out.println("Nao eh palindromo");
		}
	}
}
