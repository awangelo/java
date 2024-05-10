import java.util.Scanner;

public class MaiorElemento {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de numeros: ");
		int x = sc.nextInt();
		double arr[] = new double[x];
		double maior = 0;
	
		System.out.println("Insira os numeros");
		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextDouble();
			
			if (arr[i] > maior) {
				maior = arr[i];
			}
		}
		
		System.out.print("Maior numero: " + maior);
	}
}
