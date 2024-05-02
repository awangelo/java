import java.util.Scanner;

public class LimparScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();	//Limpa o \n da do ultimo imput (int);
		String str = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(num);
		System.out.println(str);
	}
}
