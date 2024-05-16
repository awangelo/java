import java.util.Scanner;
import ent.Estudante;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Estudante est = new Estudante();

        System.out.print("Digite o nome do aluno: ");
        est.nome = sc.nextLine();
        System.out.print("Insira as 3 notas do estudante: ");
        est.trim1 = sc.nextDouble();
        est.trim2 = sc.nextDouble();
        est.trim3 = sc.nextDouble();
        sc.close();

        est.Resultado();
    }
}
