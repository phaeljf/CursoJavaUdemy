import entities.Conta;
import exceptions.SaqueException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);


    try{
        IO.println("Entre com os dados da Conta");
        IO.print("Numero: ");
        Integer numero = sc.nextInt();

        sc.nextLine();
        IO.print("Cliente: ");
        String cliente = sc.nextLine();

        IO.print("Saldo Inicial: ");
        Double saldo = sc.nextDouble();

        IO.print("Limite Saque: ");
        Double limiteSaque = sc.nextDouble();

        Conta c1 = new Conta(numero, cliente, saldo, limiteSaque);

        IO.println();
        IO.print("Entre quantidade para sacar: ");
        Double sacar = sc.nextDouble();
        c1.sacar(sacar);

        System.out.printf("Novo saldo: R$%.2f%n", c1.getSaldo());


    }catch(InputMismatchException e){
        IO.print("Dado Inserido Incorretamente");
    }catch (SaqueException e){
        IO.print(e.getMessage());
    }


    sc.close();
}
