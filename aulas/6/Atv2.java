import java.util.Scanner;

public class Atv2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, ele[] = new int[8];
		
		for (i = 0; i < 8; i++) {
			ele[i] = i+1;
		}
		
		System.out.print("Insira os indices a serem trocados: ");
		int troca1 = sc.nextInt();
		int troca2 = sc.nextInt();
		
		int temp = ele[troca1];
		ele[troca1] = ele[troca2];
		ele[troca2] = temp;
		
		System.out.println("");
		for (i = 0; i < 8; i++) {
			System.out.printf("%d ", ele[i]);
		}
		
	}
}
