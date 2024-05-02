import java.util.Scanner;

public class TransformarEm10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		
		if (num!=10)
		{
			num = 10;
			System.out.println("Transformado");
		}
	}
}
