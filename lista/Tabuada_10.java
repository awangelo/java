import java.util.Scanner;

public class Tabuada_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um numero: ");
		int n = sc.nextInt();
		sc.close;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(n*i+" ");
		}
	}
}
