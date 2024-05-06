import java.util.Scanner;

public class WhileSenha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean acertou = false;
		
		System.out.print("Insira a senha: ");
		while (!acertou) {
			int senha = sc.nextInt();
			if (senha == 2002) {
				acertou = true;
				System.out.println("Acesso Permitido");
			}
			else {
				System.out.println("Senha Invalida");
			}
		}
		sc.close();
	}
}
