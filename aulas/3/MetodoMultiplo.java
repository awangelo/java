import java.util.Scanner;
import java.lang.Math;

public class MetodoMultiplo {
	
	static boolean mult(int x) {
		if (x%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um inteiro: ");
		int x = sc.nextInt();
		
		if (mult(x)) {
			System.out.print("Eh multiplo de 2");
		}
		else {
			System.out.println("Nao eh multiplo de 2");
		}
	}
}
