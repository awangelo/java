import java.util.Scanner;

public class Temperatura_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em celsius: ");
        double cels = sc.nextDouble();
        sc.close();
        double fahrenheit = (9 * cels / 5) + 32;
            
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}
