public class FuncionarioPJ extends Funcionario {
    private double bonus;

    public FuncionarioPJ(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        double salarioLiquido = this.salarioBase + this.bonus;
        System.out.println("O Salário do funcionário PJ é: R$"+salarioLiquido);
        return salarioLiquido;
    }
}
