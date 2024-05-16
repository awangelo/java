package ent;

public class Estudante {
    public String nome;
    public double trim1, trim2, trim3;

    public void Resultado() {
        double nota = (trim1 + trim2 + trim3);

        if (nota < 60) {
            System.out.println("Nota final: " + nota);
            System.out.println("Ficou fudido, faltaram: " + (60 - nota) + " pontos");
        } else {
            System.out.println("Nota final: " + nota);
            System.out.println("Aprovado");
        }
    }
}
