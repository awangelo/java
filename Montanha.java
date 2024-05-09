import java.util.Scanner;

public class Montanha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a altura da montanha (1 a 5): ");
		int altura = sc.nextInt();
		System.out.println("Insira o tamanho do grafico: ");
		int tamanho = sc.nextInt();
		System.out.println("Insira as cordenadas (x e y): ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		desenhar(altura, tamanho, x, y);
	}

	static void desenhar(int altura, int tamanho, int x, int y) {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < tamanho; j++) {
				if (j == x) {
					System.err.print(altura);
				}
				else if (j == x - 1 || j == x + 1) {
					System.out.print(altura - 1);
				}
				else {
					System.out.print("0");
				}
			}
		System.out.println();
		altura--;
		}
	}
}