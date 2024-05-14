import java.util.Scanner;

import entity.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Insira o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Insira a matricula do aluno: ");
        aluno.matricula = sc.nextInt();
        
        aluno.notas = new double[3];
        System.out.println("Insira as 3 notas do aluno: ");
        for (int i = 0; i < aluno.notas.length; i++) {
            aluno.notas[i] = sc.nextDouble();
        }
        sc.close();

        System.out.println();
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matricula: " + aluno.matricula);
        System.out.printf("Media: %.2f\n", aluno.getMedia(aluno.notas));
        System.out.println("Aprovado: " + aluno.aprovado());
    }
}
