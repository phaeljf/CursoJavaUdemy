import entities.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Locale.setDefault(new Locale("US"));
    Scanner sc = new Scanner(System.in);

/*
    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();

    int[] vect = new int[n];

    for (int i = 0; i < vect.length; i++) {
        System.out.print("Digite um numero: ");
        vect[i] = sc.nextInt();
    }

    System.out.println("NUMEROS NEGATIVOS");
    for (int i = 0; i < vect.length; i++) {
        if (vect[i] < 0) {
            System.out.println(vect[i]);
        }
    }
*/


    System.out.print("Quantas pessoas serão criadas? ");
    int pessoas = sc.nextInt();

    Pessoa[] p = new Pessoa[pessoas];
    double sumAltura = 0;
    int mediaPessoas16 = 0;

    for (int i = 0; i < p.length; i++) {
        System.out.println("Dados da pessoa " + (i + 1) + " : ");

        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        p[i] = new Pessoa(nome, idade, altura);

        sumAltura += p[i].getAltura();

        if (p[i].getIdade() < 16){
            mediaPessoas16++;
        }
    }

    System.out.println("Altura média: "+sumAltura/p.length);
    System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n",((double)mediaPessoas16 / p.length) * 100);

    for (Pessoa pessoa : p) {
        if (pessoa.getIdade() < 16){
            System.out.println(pessoa.getNome());
        }
    }




    sc.close();
}
