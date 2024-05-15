import java.util.Scanner;
import entity.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um animal (1 - Mamifero, 2 - Ave, 3 - Reptil):");

        switch (sc.nextInt()) {
            case 1:
                Mamifero mamifero = new Mamifero("Leao", 5, "Macio");
                System.out.println("Nome: " + mamifero.getNome());
                System.out.println("Idade: " + mamifero.getIdade());
                mamifero.amamentar();
                break;
            case 2:
                Ave ave = new Ave("Aguia", 10, 2);
                System.out.println("Nome: " + ave.getNome());
                System.out.println("Idade: " + ave.getIdade());
                ave.voar();
                break;
            case 3:
                Reptil reptil = new Reptil("Cobra", 3, true);
                System.out.println("Nome: " + reptil.getNome());
                System.out.println("Idade: " + reptil.getIdade());
                reptil.tomarSol();
                break;
            default:
                System.out.println("Opção inválida.");
        }
        sc.close();
    }
}