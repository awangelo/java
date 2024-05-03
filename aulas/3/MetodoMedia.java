public class MetodoMedia {
	static double media(double... numeros) {
		int soma = 0;
		
		for (double numero : numeros) {
			soma += numero;
		}
		
		return (double) soma / numeros.length;
	}
	
	public static void main(String[] args) {
		double res = media(5.5, 10, 20, 30, 40, 50);
		System.out.printf("Media: %.2f", res);
	}
}
