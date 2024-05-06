import java.util.Scanner;

public class DoTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;
        
        do {
            System.out.print("Digite a temperatura em celsius: ");
            double cels = sc.nextDouble();
            
            double fahrenheit = (9 * cels / 5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
            System.out.print("Deseja repetir (s/n)? ");
            
            repetir = sc.next().charAt(0);
        } while (repetir == 's' || repetir == 'S');
        
        sc.close();
    }
}
