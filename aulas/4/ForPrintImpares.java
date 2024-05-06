import java.util.Scanner;

public class ForPrintImpares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor limite: ");
		int x = sc.nextInt();
		sc.close();
		
		for (int i = 0; i <= x; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
