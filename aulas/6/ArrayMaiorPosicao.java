import java.util.Scanner;

public class ArraySomaMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a qnt de numeros: ");
		int n = sc.nextInt();
		double numeros[] = new double[n];
		
		
		System.out.print("Insira os n numeros: ");
		for (int i = 0; i < n; i++) {
			numeros[i] = sc.nextDouble();
		}
		sc.close();
		
		double maiorNumero = numeros[0];
        int posicaoMaior = 0;
        for (int i = 1; i < n; i++) {
			if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
                posicaoMaior = i;
            }
		}
		
		System.out.println("Maior numero: " + maiorNumero);
        System.out.printf("Posicao do maior numero: %d", posicaoMaior+1);
	}
}
