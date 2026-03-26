import entities.ContribuintePessoaFisica;
import entities.ContribuintePessoaJuridica;
import entities.Contribuintes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite Quantidade de Contribuintes: ");
    int qntContribuintes = sc.nextInt();

    List<Contribuintes> contribuintes = new ArrayList<>();

    for (int i = 1; i <= qntContribuintes; i++) {
        System.out.println("Dados Contribuinte #" + i + ": ");
        System.out.print("Pessoa Fisica ou Juridica (F/J)");
        char tipoPessoa = sc.next().toLowerCase().charAt(0);

        if (tipoPessoa == 'f') {
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda Anual: ");
            double rendaAnual = sc.nextDouble();
            System.out.print("Custos Saúde: ");
            double custoSaude = sc.nextDouble();

            contribuintes.add(new ContribuintePessoaFisica(nome, rendaAnual, custoSaude));

        } else if (tipoPessoa == 'j') {
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda Anual: ");
            double rendaAnual = sc.nextDouble();
            System.out.print("Quantidade de Funcionarios: ");
            int quantidadeFuncionarios = sc.nextInt();

            contribuintes.add(new ContribuintePessoaJuridica(nome, rendaAnual, quantidadeFuncionarios));
        }
    }

    System.out.println("IMPOSTO PAGO:");
    double somaImposto = 0.0;
    for (Contribuintes contribuinte : contribuintes) {
        double imposto = contribuinte.calcularImposto();
        System.out.printf("%s: R$ %.2f%n", contribuinte.getNome(), imposto);
        somaImposto += imposto;
    }

    System.out.printf("TOTAL IMPOSTO PAGO: R$ %.2f\n", somaImposto);
}
