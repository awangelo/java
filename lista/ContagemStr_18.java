import java.util.Scanner;

public class ContagemStr_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		
		System.out.print("Insira uma string: ");
		String str = sc.nextLine();
		System.out.println("Insira o caractere: ");
        char caractere = sc.next().charAt(0);
		sc.close();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == caractere) {
				cont++;
			}
		}
		
		System.out.print("Numero de repeticoes do caractere: " + cont);
	}
}
