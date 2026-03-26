import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new FuncionarioCLT("João", 3000));
        funcionarios.add(new FuncionarioPJ("Antonio", 3000, 1000));

        for (Funcionario f : funcionarios) {
            f.getNome();
            f.calcularSalario();
        }



    }
}