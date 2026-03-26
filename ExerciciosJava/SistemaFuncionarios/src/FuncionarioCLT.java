public class FuncionarioCLT extends Funcionario {

    private static final double desconto = 0.1;

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double salarioLiquido = this.salarioBase - (desconto*salarioBase);
        System.out.println("O Salário do funcionário CLT é: R$"+salarioLiquido);
        return salarioLiquido;
    }
}
