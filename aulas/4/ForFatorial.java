import java.util.Scanner;

public class ForFatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor de n: ");
		int n = sc.nextInt();
		int facto = 1;
		sc.close();
		
		if (n == 0) {
			System.out.println("1");
		}
		
		for (int i = 1; i <= n; i++) {
			facto *= i;
		}
		
		System.out.print(facto);
	}
}
