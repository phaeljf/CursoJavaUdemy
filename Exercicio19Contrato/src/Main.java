import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    try (Scanner sc = new Scanner(System.in)) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Locale.setDefault(Locale.US);
        IO.println("Entre os dados do Contrato:");
        IO.print("Numero: ");
        int numberContract = sc.nextInt();
        IO.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        IO.print("Valor do Contrato: ");
        Double amountContract = sc.nextDouble();
        IO.print("Entre com o numero de parcelas: ");
        int numberInstallments = sc.nextInt();

        Contract contract = new Contract(numberContract, date, amountContract);
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, numberInstallments);

        IO.println("Parcelas:");
        for (Installment i : contract.getInstallments()) {
            System.out.printf("%s - %.2f%n", i.getDueDate().format(dtf), i.getAmount());
        }


    } catch (Exception e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
    }

}
