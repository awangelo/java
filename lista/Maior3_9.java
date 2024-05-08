import java.util.Scanner;

public class Maior3_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite 3 numeros: ");
		double x = sc.nextInt();
		double y = sc.nextInt();
		double z = sc.nextInt();
		sc.close();
		if (x > y || x > z) {
			System.out.println("O primeiro eh maior");
		}
		else if (y > z) {
			System.out.println("O segundo eh maior");
		}
		else {
			System.out.println("O terceiro eh maior");
		}
	}
}
