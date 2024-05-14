package entity;

public class ContaBancaria {
    public int numero;
    public double saldo;
    public String titular;
    
    public void Depositar(double valor) {
        saldo += valor;
    }

    public void Sacar(double valor) {
        saldo -= valor;
    }
}