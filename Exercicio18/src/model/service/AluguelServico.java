package model.service;

import model.entities.AluguelCarro;
import model.entities.Fatura;

public class AluguelServico {

    private Double precoPorHora;
    private Double precoPorDia;

    private ImpostoBrasilServico impostoServico;

    public AluguelServico(Double precoPorHora, Double precoPorDia, ImpostoBrasilServico impostoServico) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.impostoServico = impostoServico;

    }

    public Double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(Double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public Double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(Double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public ImpostoBrasilServico getImpostoServico() {
        return impostoServico;
    }

    public void processarFatura(AluguelCarro ac) {
        ac.setFatura(new Fatura(50.0, 10.0));
    }
}
