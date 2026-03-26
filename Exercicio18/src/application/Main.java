import model.entities.AluguelCarro;
import model.entities.Veiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

    System.out.println("Entre com os dados do Aluguel: ");
    System.out.print("Entre com modelo do Carro:: ");
    String carModelo = sc.nextLine();
    System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
    LocalDateTime dataRetirada = LocalDateTime.parse(sc.nextLine(), dtf);
    System.out.print("Devoluçao (dd/MM/yyyy hh:mm): ");
    LocalDateTime dataDevolucao = LocalDateTime.parse(sc.nextLine(), dtf);

    AluguelCarro ac = new AluguelCarro(dataRetirada, dataDevolucao, new Veiculo(carModelo));

    System.out.println("Aluguel realizado com sucesso!");
    System.out.println("Aluguel realizado com sucesso!");

    sc.close();
}
