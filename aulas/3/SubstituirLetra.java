import java.util.Scanner;

public class SubstituirLetra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira uma frase: ");
		String frase = sc.nextLine();
		sc.close();

		String fraseTrocada = frase.replaceAll("[aeiouAEIOU]", "");
		
		System.out.println("String sem vogais: " + fraseTrocada);
	}
}
