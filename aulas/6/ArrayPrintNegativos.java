import java.util.Scanner;

public class ArrayPrintNegativos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a qnt de numeros: ");
		int n = sc.nextInt();
		int numeros[] = new int[10];
		if (n > 10) {
			System.out.print("Insira n <= 10");
			n = sc.nextInt();
		}
		
		System.out.print("Insira os n numeros: ");
		for (int i = 0; i < n; i++) {
			numeros[i] = sc.nextInt();
		}
		sc.close();
		
		for (int j = 0; j < n; j++) {
			if (numeros[j]<0) {
				System.out.printf("numeros negativo: %d\n", numeros[j]);
			}
		}
	}
}
