//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um caminho de arquivo: ");
    String strPath = sc.nextLine();

    File arquivo = new File(strPath);

    System.out.println(arquivo.getPath());


    // CRIANDO PASTAS
    /*
    IO.println("ENtre o caminho do path: ");
    String strPath = sc.nextLine();

    File path = new File(strPath);

    File[] folders = path.listFiles(File::isDirectory);
    File[] files = path.listFiles(File::isFile);

    IO.println("Pastas");
    for (File f : folders) {
        IO.println(f);
    }
    for (File f : files) {
        IO.println(f);
    }


    System.out.print("Digite um nome de diretorio: ");
    String nomeDiretorio = sc.nextLine();


    String newPath = path + File.separator + nomeDiretorio;
    boolean sucesso = new File(newPath).mkdirs();
    if (sucesso) {
        System.out.println("Diretorio criado com sucesso"+ sucesso);
    }
    */

    // CRIANDO ARQUIVOS
    /*

    String[] linhas = new String[] {"Bom dia", "Boa noite", "Ja era"};

    String path = "C:\\Users\\phael\\Downloads\\saida.txt";

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

        for (int i = 0; i < linhas.length; i++) {
            bw.write(linhas[i]);
            if (i != linhas.length - 1) {
                bw.newLine();
            }
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    } finally {
        System.out.println("Criado o arquivo no path: " + path);
    }

     */

    sc.close();
}
