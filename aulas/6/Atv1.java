import java.util.Scanner;

public class Atv1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ele[] = new int[7];
		
		System.out.print("Insira o numero a ser adcionado: ");
		int n = sc.nextInt();
		
		ele[0] = n;
		ele[6] = n;
		
		for (int i = 0; i < n; i++) {
			System.out.println(ele[i]);
		}
		
	}
}
