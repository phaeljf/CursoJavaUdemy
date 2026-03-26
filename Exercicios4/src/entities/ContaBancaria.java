package entities;

import java.util.Locale;

public class ContaBancaria {

    private final int numeroDaConta;
    private String titularDaConta;
    private double saldoDaConta;

    public ContaBancaria(int numeroDaConta, String titularDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
        this.saldoDaConta = 0;
    }

    public ContaBancaria(int numeroDaConta, String titularDaConta, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
        depositar(depositoInicial);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public String getTitularDaConta() {
        return titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public void depositar(double deposito) {
        this.saldoDaConta += deposito;
    }

    public void sacar(double saque) {
        double taxa = 5.00;
        this.saldoDaConta -= saque + taxa;
    }

    @Override
    public String toString() {
        return  String.format(
                "Atualização da Conta: %n" +
                "Número da Conta: %d, Titular: %s, Saldo: R$ %.2f %n",
                numeroDaConta, titularDaConta, saldoDaConta
        );
    }
}
