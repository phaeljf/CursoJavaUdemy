public class Funcionarios {

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionarios(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentarSalario(Double porcentagem) {
        this.salario += salario * (porcentagem/100);
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f", id, nome, salario);
    }
}
