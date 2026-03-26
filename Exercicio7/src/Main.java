//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    IO.print("Quantos funcionários irão inseridos: ");
    int qtdFuncionarios = sc.nextInt();

    int n = 0;

    ArrayList<Funcionarios> listaFuncionarios  = new ArrayList<>();

    do {
        IO.println("Empregado #" + (n+1) );
        IO.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        IO.print("Nome: ");
        String nome = sc.nextLine();

        IO.print("Salario: ");
        Double salario = sc.nextDouble();


        if (listaFuncionarios.stream().anyMatch(f -> f.getId() == id)) {
            IO.print("ID já existente.");
        } else {
            listaFuncionarios.add(new Funcionarios(id,nome,salario));
            n++;
        }

    }while(n < qtdFuncionarios);

    IO.print("Entre com o ID do empregado que o salário vai aumentar: ");
    int idEmpregadoPesquisar = sc.nextInt();

    Funcionarios funcionario = listaFuncionarios.stream().filter(f -> f.getId() == idEmpregadoPesquisar).findFirst().orElse(null);

    if (funcionario == null) {
        IO.print(" ID não encontrado!!");
    } else {
        IO.print("Entre com o valor da porcentagem: ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);
    }

    for (Funcionarios f : listaFuncionarios) {
        IO.println(f);
    }



    sc.close();
}
