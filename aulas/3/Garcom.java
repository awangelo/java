import java.util.Scanner;

public class Garcom {
	static int quebrados(int numBan, Scanner sc) {
		int totalCoposQuebrados = 0;
		System.out.println("Insira neste formato: (x copos-y latas)");
		for (int i = 1; i <= numBan; i++) {
			System.out.print(i+" bandeja: ");
			String conteudo = sc.nextLine();
			String[] band = conteudo.split("-");
			int latas = Integer.parseInt(band[0]);
            int copos = Integer.parseInt(band[1]);
            
			if (latas > copos) {
				totalCoposQuebrados += copos;
			}
		}
		return totalCoposQuebrados;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de bandejas: ");
		int numBan = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Total de quebrados: " + quebrados(numBan, sc));
		
		
		
	}
}
