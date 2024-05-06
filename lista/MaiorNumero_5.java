import java.util.Scanner;

public class MaiorNumero_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira dois numeros: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x>y) {
			System.out.printf("%d eh o maior", x);
		}
		else {
			System.out.printf("%d eh o maior", y);
		}
	}
}
