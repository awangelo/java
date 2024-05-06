import java.util.Scanner;

public class Fatorial_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um numero: ");
		int fat = 1;
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 2; i <= n; i++) {
			fat*=i;
		}
		
		System.out.print("Fatorial: " + fat);
	}
}
