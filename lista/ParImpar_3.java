import java.util.Scanner;

public class ParImpar_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um numero: ");
		int n = sc.nextInt();
		sc.close();
		
		if (n%2==0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
	}
}
