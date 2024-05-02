import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira uma nota (0 - 10): ");
		double nota = sc.nextDouble();
		
		String resultado = (nota >= 5.0) ? "Voce foi aprovado!" : "Voce foi reprovado!";
		System.out.println(resultado);
	}
}
