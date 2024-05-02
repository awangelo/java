import java.util.Scanner;

public class Igual {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		
		if (num>2)
		{
			System.out.println("O numero eh maior que 2");
		}
		else if (num<2)
		{
			System.out.println("O numero eh menor que 2");
		}
		else
		{
			System.out.println("O numero eh igual a 2");
		}
	}
}
