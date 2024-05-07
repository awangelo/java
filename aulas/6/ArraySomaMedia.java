import java.util.Scanner;

public class ArraySomaMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a qnt de numeros: ");
		int soma = 0, n = sc.nextInt();
		int numeros[] = new int[n];
		
		System.out.print("Insira os n numeros: ");
		for (int i = 0; i < n; i++) {
			numeros[i] = sc.nextInt();
			soma += numeros[i];
		}
		sc.close();
			
		System.out.println("_");
		for (int i = 0; i < n; i++) {
			System.out.println(numeros[i]);
		}
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + soma/n);
		
	}
}
