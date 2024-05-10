import java.util.Scanner;

public class ContarChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qtnd de char: ");
		int x = sc.nextInt();
		char arr[] = new char[x];
		
		System.out.print("char para buscar: ");
		int alvo = sc.next().charAt(0);
		int qnt = 0;
		
		System.out.println("Digite os chars:");
		for (int i = 0; i < x; i++) {
			arr[i] = sc.next().charAt(0);
			if (arr[i] == alvo) {
				qnt++;
			}
		}
		
		System.out.println("qnt: " + qnt);
	}
}
