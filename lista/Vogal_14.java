import java.util.Scanner;

public class Vogal_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		
		System.out.print("Insira uma frase: ");
		String frase = sc.nextLine();
		sc.close();
		
		frase = frase.toLowerCase();
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				cont++;
			}
		}
		
		System.out.print("Qntd de vogais: " + cont);
	}
}
