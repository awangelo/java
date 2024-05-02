import java.util.Scanner;
import java.util.Random;

public class Advinhar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Chute numeros entre 1 e 100: ");

		int chute = 0;
		int num = rand.nextInt(100)+1;

		while (chute != num) {
			chute = sc.nextInt();		
			
			if (chute > num) {
				System.out.println("Muito alto!");
			}
			else if (chute < num) {
				System.out.println("Muito baixo!");
			}
			else {
				System.out.println("Voce acertou");
			}
		}
	}
}
