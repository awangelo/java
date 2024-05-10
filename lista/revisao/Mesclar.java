import java.util.Scanner;

public class Mesclar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de numeros: ");
		int x = sc.nextInt();
		int numeros1[] = new int[x];
		int numeros2[] = new int[x];
		
		System.out.println("Insira os numeros do 1ro arr");
		for (int i = 0; i < x; i++) {
			numeros1[i] = sc.nextInt();
		}
		
		System.out.println("Insira os numeros do 2do arr");
		for (int i = 0; i < x; i++) {
			numeros2[i] = sc.nextInt();
		}
		
		mesc(numeros1, numeros2, x);
	}
	
	static void mesc(int[] num1, int[] num2, int x) {
		int fim[] = new int[2*x];
		
		for (int i = 0; i < 2*x; i+=2) {
			fim[i] = num1[i];
			fim[i+1] = num2[i];
		}
		System.out.println();
		for (int s : fim) {
			System.out.print(s + "_");
		}
		
	}
}
