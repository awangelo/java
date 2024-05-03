import java.util.Scanner;

public class SubstituirLetra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira uma frase: ");
		String frase = sc.nextLine();
		System.out.print("Escolha uma letra: ");
		char letra = sc.next(".").charAt(0);
		sc.close();
		
		String fraseTrocada = frase.replace('a', letra);
		System.out.println("Frase com letras trocadas: " + fraseTrocada);
	}
}
