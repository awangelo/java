import java.util.Scanner;

public class SomaElementos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de numeros: ");
		int x = sc.nextInt();
		double soma[] = new double[x];
		double fim = 0;
		
		System.out.println("Insira os numeros:");
		for (int i = 0; i < x; i++) {
			soma[i] = sc.nextDouble();
			fim += soma[i];
		}
		sc.close();
		
		System.out.print("Soma: " + fim);
	}
}
