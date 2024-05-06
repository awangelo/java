import java.util.Scanner;

public class Soma_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira dois numeros: ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		System.out.printf("Soma: %d", x+y);
		
	}
}
