//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    String path = "C:\\Users\\phael\\AppData\\Roaming\\HexChat\\logs\\#Paradox.log";

    int contadorSessoes = 0;
    boolean sessaoComRpg = false;
    boolean sessaoExiste = false;

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

        String linha = br.readLine();

        while (linha != null) {

            if (linha.startsWith("**** REGISTRO COMEÇANDO")) {

                if (sessaoExiste && sessaoComRpg) {
                    contadorSessoes++;
                }

                sessaoComRpg = false;
                sessaoExiste = true;
            }

            if (linha.contains("<") && linha.contains(">")) {
                sessaoComRpg = true;
            }
            linha = br.readLine();
        }

        if (sessaoComRpg) {
            contadorSessoes++;
        }

        System.out.println("Total de sessoes: " + contadorSessoes);


    } catch (IOException e) {
        System.out.println("Erro ao abrir o arquivo" + e.getMessage());

    }
}
