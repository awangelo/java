package entity;

public class CircuitoEletronico {
    private int corrente;
    private int tensao;

    public CircuitoEletronico(int corrente, int tensao) {
        this.corrente = corrente;
        this.tensao = tensao;
    }

    public double calcResistencia() {
        if (corrente == 0) {
            return Double.POSITIVE_INFINITY;
        } else {
            return tensao / corrente;
        }
    }

    public double calcPotencia() {
        return tensao * corrente;
    }

    public int getCorrente() {
        return corrente;
    }

    public int getTensao() {
        return tensao;
    }

}
