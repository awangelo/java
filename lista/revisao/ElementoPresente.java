import java.util.Scanner;

public class ElementoPresente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		
		String arr[] = frase.split(" ");
		
		System.out.print("Palavra a ser buscada: ");
		String palavra = sc.next();
		sc.close();
		
		for (String s : arr) {
			if (s.equals(palavra)) {
				System.out.println("Encontrada");
			}
		}
	}
}
