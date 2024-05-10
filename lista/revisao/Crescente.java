import java.util.Scanner;

public class Crescente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de numeros: ");
		int x = sc.nextInt();
		int arr[] = new int[x];
		int maior[] = new int[x];
		for (int s: arr) {
			s = sc.nextInt();
			if (arr[s] > maior[s]) {
				maior[s] = s;
			}
		}

		for (int m : maior) {
			System.out.print(m + "_");
		}
		
	}
}
