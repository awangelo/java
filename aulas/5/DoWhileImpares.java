import java.util.Scanner;

public class DoWhileImpares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, par = 0, impar = 0;
		
		System.out.println("Insira valores: ");
		do {
			n = sc.nextInt();
			
			if (n<0) {
				continue;
			}
			if (n%2==0) {
				par++;
			}
			else {
				impar++;
			}
		} while (n != -1);
		System.out.printf("impares: %d\npares: %d", impar, par);
		
	}
}
