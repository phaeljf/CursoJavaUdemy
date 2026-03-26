import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Scanner sc = new Scanner(System.in);
    IO.print("Digire a quantidade de produtos: ");
    int quantidade = sc.nextInt();

    List<Product> produtos = new ArrayList<>();

    for(int i = 0; i < quantidade; i++){

        IO.println("Produto #" + (i+1) + " Dados:");
        IO.print("Comum, Usado ou Importado (c/u/i)? ");
        char tipo = sc.next().toLowerCase().charAt(0);

        if(tipo == 'c'){
            IO.print("Nome: ");
            String nome = sc.next();
            IO.print("Preço: ");
            double valor = sc.nextDouble();

            produtos.add(new Product(nome, valor));

        } else if (tipo == 'i') {
            IO.print("Nome: ");
            String nome = sc.next();
            IO.print("Preço: ");
            double valor = sc.nextDouble();
            IO.print("Taxa Importação: ");
            double taxa = sc.nextDouble();

            produtos.add(new ImportedProduct(nome, valor, taxa));

        } else if (tipo == 'u') {
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            IO.print("Nome: ");
            String nome = sc.next();
            IO.print("Preço: ");
            double valor = sc.nextDouble();

            IO.print("Data Manufaturamento (DD/MM/YYYY): ");
            LocalDate dataManufaturamento = LocalDate.parse(sc.next(), df);

            produtos.add(new UsedProduct(nome, valor, dataManufaturamento));
        }
    }

    for(Product p : produtos){
        IO.println(p.priceTag());
    }

}
