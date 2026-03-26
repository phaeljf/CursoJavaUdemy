package model.entities;

public class Fatura {

    private Double taxa;
    private Double pagamentoBasico;

    public Fatura(Double taxa, Double pagamentoBasico) {
        this.taxa = taxa;
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(Double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getPagamentoTotal() {
        return getTaxa() + getPagamentoBasico();
    }
}
