import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		while ((num = sc.nextInt()) != -1) {
			if (num >= 0) {
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
			}
			else {
				System.out.println("Insira apenas numeros > 0");
			}
		}
		System.out.printf("menor: %d\nmaior: %d", min, max);
		sc.close();
	}
}
