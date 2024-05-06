import java.util.Scanner;

public class PostoDeCombustivel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, g = 0, d = 0, cod;
		System.out.printf("1 - Alcool\n2 - Gasolina\n3 - Disel\n4 - Fim\n");
		System.out.print("Insira o tipo de combustivel: ");
		
		
		do {
			cod = sc.nextInt();
			switch (cod) {
				case 1:
					a++;
					break;
				case 2:
					g++;
					break;
				case 3:
					d++;
					break;
				case 4:
					break;
				default:
					System.out.println("Codigo invalido, insira novamente!");
			}
		} while (cod != 4);
		System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d", a, g, d);
		sc.close();
	}
}
