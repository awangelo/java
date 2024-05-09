import java.util.Scanner;

public class Esfera_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();
        sc.close();
        
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        
        System.out.println("Volume da esfera: " + volume);
    }
}