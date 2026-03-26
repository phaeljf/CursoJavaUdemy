//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

    //soma de valores
    IO.println("Digite um valor: ");
    int valor = sc.nextInt();
    IO.println("Digite outro valor: ");
    int valor2 = sc.nextInt();
    System.out.printf("Soma de %d + %d = %d%n", valor, valor2, valor + valor2);

    //area de um circulo
    IO.println("Digite um valor para raio do circulo: ");
    double area = sc.nextDouble();
    double pi = 3.14159;
    System.out.printf("A área do círculo é: %.4f%n", pi * Math.pow(area, 2));

    //
    IO.println("Digite valor A: ");
    int A = sc.nextInt();
    IO.println("Digite valor A: ");
    int B = sc.nextInt();
    IO.println("Digite valor C: ");
    int C = sc.nextInt();
    IO.println("Digite valor D: ");
    int D = sc.nextInt();
    System.out.printf("A diferença dos dois primeiros (%d + %d) com os dois últimos (%d + %d) é igual a %d%n", A, B, C, D, (A * B - C * D));

    //calculo valor a receber
    IO.println("Digite o número do Funcionáiro: ");
    int numeroFuncionario = sc.nextInt();
    IO.println("Digite suas horas trabalhadas");
    int horasTrabalhadas = sc.nextInt();
    IO.println("Digite seu valor hora");
    double valorHora = sc.nextDouble();
    System.out.printf("O funcionário %d recebe salário de %.2f", numeroFuncionario, valorHora*horasTrabalhadas);

    //Programa que calcula preço 2 produtos
    IO.println("Digite o código da peça 1: ");
    int codigo = sc.nextInt();
    IO.println("Digite a quantidade de peças pedidas: ");
    int quantidade = sc.nextInt();
    IO.println("Digite o valor unitário:");
    double valorUnitario = sc.nextDouble();
    IO.println("Digite o código da peça 2: ");
    int codigo2 = sc.nextInt();
    IO.println("Digite a quantidade de peças pedidas: ");
    int quantidade2 = sc.nextInt();
    IO.println("Digite o valor unitário:");
    double valorUnitario2 = sc.nextDouble();
    System.out.printf("VALOR A PAGAR: %.2f", quantidade*valorUnitario + quantidade2*valorUnitario2);

    //Ler 3 valores e calcule
    IO.println("Digite valor 1: ");
    double valorA = sc.nextDouble();
    IO.println("Digite valor 2: ");
    double valorB = sc.nextDouble();
    IO.println("Digite valor 3: ");
    double valorC = sc.nextDouble();
    System.out.printf(
            "TRIANGULO: %.2f%n" +
            "CIRCULO: %.2f%n" +
            "TRAPEZIO: %.2f%n" +
            "QUADRADO: %.2f%n" +
            "RETANGULO: %.2f%n",

            (valorA * valorC)/2,
            pi * Math.pow(valorC, 2.0),
            ((valorA + valorB) * valorC) / 2,
            valorB*valorB,
            valorA*valorB
    );


    sc.close();
}
