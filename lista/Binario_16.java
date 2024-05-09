import java.util.Scanner;

public class Binario_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimal = 0;
		int expo = 0;
		
		System.out.print("Insira um numero binario: ");
		String bin = sc.next();
		sc.close();
		
		for (int i = bin.length() - 1; i >= 0; i--) {
			int digito = bin.charAt(i) - '0';
			
			decimal += digito * Math.pow(2, expo);
			
			expo++;
		}
		
		System.out.println("Numero deimal: " + decimal);
	}
}
