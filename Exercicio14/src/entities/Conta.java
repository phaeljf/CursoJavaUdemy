package entities;

import exceptions.SaqueException;

public class Conta {

    private Integer numero;
    private String cliente;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numero, String cliente, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }


    public Integer getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor) throws SaqueException {
        if(valor > this.saldo){
            throw  new SaqueException("Erro ao Sacar: Saldo insuficiente");
        }
        if(valor > this.limiteSaque){
            throw  new SaqueException("Erro ao Sacar: Saque maior que límite de saque");
        }
        this.saldo -= valor;
    }
}
