//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);
/*
    //valro negativo ou nao
    IO.println("Digite um valor:");
    int valor = sc.nextInt();
    if (valor >= 0){
        System.out.println("NÃO NEGATIVO");
    } else {
        System.out.println("NEGATIVO");
    }

    if (valor % 2 == 0){
        System.out.println("PAR");
    } else {
        System.out.println("IMPAR");
    }

    //Verificar se sao multipos
    IO.println("Digite valor A:");
    int a = sc.nextInt();
    IO.println("Digite valor B:");
    int b = sc.nextInt();
    if ( a % b == 0 || b % a == 0){
        System.out.println("Sao multiplos");
    } else {
        System.out.println("Não Sao multiplos");
    }

    //calcular hora que jogou podendo durar max 24h

    IO.println("Digite hora começou:");
    int comecou = sc.nextInt();
    IO.println("Digite hora terminou:");
    int terminou = sc.nextInt();
    int horasJogadas;

    if (comecou > terminou){
        horasJogadas = (24 - comecou) + terminou;
    } else if (comecou < terminou){
        horasJogadas = terminou - comecou;
    } else {
        horasJogadas = 24;
    }
    System.out.printf("O JOGO DUROU %d HORA(S)%n", horasJogadas);

    //calcular preço pedido seguindo a lista de itens
    Locale.setDefault(Locale.US);

    IO.println("Digite o código do produto:");
    int cod = sc.nextInt();
    IO.println("Digite a quandidade do produto:");
    int quantidade = sc.nextInt();
    double total = 0;
    switch (cod){
        case 1:
            total = 4.0 * quantidade;
            break;
        case 2:
            total = 4.5 * quantidade;
            break;
        case 3:
            total = 5.0 * quantidade;
            break;
        case 4:
            total = 2.0 * quantidade;
            break;
        case 5:
            total = 1.5 * quantidade;
            break;
        default:
            System.out.println("Código Inválido!");
            return;
    }
    System.out.printf("Total: R$ %.2f%n", total);

    //Verificar numero no intervalo
    System.out.println("Digite um valor: ");
    double valorIntervalo = sc.nextDouble();

    if (valorIntervalo >= 0 && valorIntervalo <= 25) {
        System.out.println("Intervalo (0,25]");
    } else if (valorIntervalo > 25 && valorIntervalo <= 50) {
        System.out.println("Intervalo (25,50]");
    } else if (valorIntervalo > 50 && valorIntervalo <= 75) {
        System.out.println("Intervalo (50,75]");
    } else if (valorIntervalo > 75 && valorIntervalo <= 100) {
        System.out.println("Intervalo (75,100]");
    } else {
        System.out.println("Fora do intervalo");
    }

*/
    //Verificar numero no quadrante
    System.out.println("Digite o valor de X: ");
    double x = sc.nextDouble();
    System.out.println("Digite o valor de Y: ");
    double y = sc.nextDouble();

    if(x > 0 && y > 0){
        System.out.println("Q1");
    } else if (x < 0 && y > 0){
        System.out.println("Q2");
    } else if (x < 0 && y < 0){
        System.out.println("Q3");
    } else if (x > 0 && y < 0){
        System.out.println("Q4");
    } else {
        System.out.println("Origem");
    }

}
