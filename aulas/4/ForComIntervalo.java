import java.util.Scanner;

public class ForComIntervalo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor;
		int total = 0;
		
		System.out.print("Digite a quantitidade lida: ");
		int qntLida = sc.nextInt();
		System.out.println("Insira os numeros: ");
		for (int i = 0; i < qntLida; i++) {
			valor = sc.nextDouble();
			if (valor <= 20 && valor >= 10) {
				total++;
			}
			else {
				continue;
			}
		}
		
		System.out.println("\n" + total);
		sc.close();
	}
}
