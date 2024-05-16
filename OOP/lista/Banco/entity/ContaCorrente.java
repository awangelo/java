package entity;

public class ContaCorrente {
    private double saldo = 10000.0;
    private String titular = "Alice";

    public void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Boa tentativa");
        }
    }
}
