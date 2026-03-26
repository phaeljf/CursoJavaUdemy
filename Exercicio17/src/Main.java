//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

//    IO.print("Digite o caminho de entrada do arquivo: ");
//    String arquivoPathEntrada = sc.nextLine();

//    IO.print("Digite o caminho de saida do arquivo: ");
//    String arquivoPathSaida = sc.nextLine();

    String arquivoPathEntrada = "D:\\teste\\base.csv";
    String arquivoPathSaida = "D:\\teste\\saida.csv";


    try (
            BufferedReader br = new BufferedReader(new FileReader(arquivoPathEntrada));
            BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoPathSaida))
    ) {

        String proximaLinha = br.readLine();

        while (proximaLinha != null) {

            String[] linha = proximaLinha.split(";");

            Double valorItem = Double.parseDouble(linha[1].replace(",","."));
            Integer quantidade = Integer.parseInt(linha[2]);

            String valorTotal = String.valueOf(valorItem * quantidade);

            bw.write(linha[0] + ";" + valorTotal.replace(".",","));

            proximaLinha = br.readLine();

            if (proximaLinha != null) {
                bw.newLine();
            }

        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    sc.close();
}
