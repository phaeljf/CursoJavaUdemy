package entities;

public class ContribuintePessoaFisica extends Contribuintes {

    private Double gastoSaude;

    public ContribuintePessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double calcularImposto() {
        if (this.getRendaAnual() < 20000) {
            return getRendaAnual() * 0.15;
        } else {
            return getRendaAnual() * 0.25 - (getGastoSaude() * 0.5);
        }
    }
}
