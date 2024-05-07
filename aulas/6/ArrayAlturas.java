import java.util.Scanner;

public class ArrayAlturas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a qnt de pessoas: ");
		double media = 0.0;
		int n = sc.nextInt();
		double[] alturas = new double[n];
		
		System.out.println("Insira as alturas: ");
		for (int i = 0; i <= n-1; i++) {
			alturas[i] = sc.nextDouble();
			media += alturas[i];
		}
		sc.close();
		System.out.printf("Media das alturas: %f", media/n);
	}
}
