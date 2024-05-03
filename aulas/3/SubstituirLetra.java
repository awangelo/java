import java.util.Scanner;

public class SubstituirLetra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira uma frase: ");
		String frase = sc.nextLine();
		sc.close();
		
		String fraseTrocada = frase.replace('a', '');
		String fraseTrocada = frase.replace('e', '');
		String fraseTrocada = frase.replace('i', '');
		String fraseTrocada = frase.replace('o', '');
		String fraseTrocada = frase.replace('u', '');
		
		String[] array = fraseTrocada.split("");
		
		for (int i = 0; i < array.length(); i++) {
			
		}
		
		System.out.println("Frase com letras trocadas: " + fraseTrocada);
	}
}
