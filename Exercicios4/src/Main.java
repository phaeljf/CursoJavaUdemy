import entities.ContaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o numero da conta: ");
    int conta = sc.nextInt();

    System.out.print("Digite o nome do titular da conta: ");
    String titular = sc.nextLine();

    ContaBancaria cb;
    char depositar;

    do{

        System.out.print("Deseja iniciar com Deposito (s/n): ");
        depositar = sc.next().toLowerCase().trim().charAt(0);

    }while(!(depositar == 'n' || depositar == 's'));

    if (depositar == 's') {
        System.out.print("Digite o deposito inicial da conta: ");
        double depositoInicial = sc.nextDouble();
        cb = new ContaBancaria(conta, titular, depositoInicial);
    } else {
        cb = new ContaBancaria(conta, titular);
    }

    System.out.print(cb);

    System.out.print("Entre o valor de Deposito: ");
    double deposito = sc.nextDouble();
    cb.depositar(deposito);
    System.out.print(cb);

    System.out.print("Entre o valor de Saque: ");
    double saque = sc.nextDouble();
    cb.sacar(saque);
    System.out.print(cb);





    sc.close();
}
