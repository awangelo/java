package entity;

public class Aluno {
    public String nome;
    public int matricula;
    public double[] notas;

    public double getMedia(double[] notas) {
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }

        return media /= notas.length;
    }

    public boolean aprovado() {
        Aluno aluno = new Aluno();
        if (aluno.getMedia(notas) >= 7) {
            return true;
        } else {
            return false;
        }
    }
}