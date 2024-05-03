import java.util.Scanner;

public class MetodoNotas {
	static double mediaAri(double x, double y, double z) {
		return (double) (x + y + z) / 3;
	}
	
	static double mediaPon(double x, double y, double z) {
		return (double) (x*5 + y*3 + z*2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as notas: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		
		System.out.printf("\nA - media aritmetica\nP - media ponderada\n");
		char letra = sc.next(".").charAt(0);
		sc.close();

		switch (letra) 
		{
			case 'A':
				System.out.print("Media aritmetica: " + mediaAri(x, y, z));
				break;
			case 'a':
				System.out.print("Media aritmetica: " + mediaAri(x, y, z));
				break;
			case 'p':
				System.out.print("Media ponderada: " + mediaPon(x, y, z));
				break;
			case 'P':
				System.out.print("Media ponderada: " + mediaPon(x, y, z));
				break;
			default:
				System.out.print("Opcao invalida");
				return;
		}
		
	}
}
