import entities.Estudante;
import entities.Quartos;

import static entities.Quartos.quartosOcupados;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

    Quartos[] q = new Quartos[10];
    Estudante[] e = new Estudante[10];

    System.out.print("Quantos quartos serão ocupados? ");
    int ocupacao = sc.nextInt();

    for(int i = 0; i < ocupacao; i++) {
        IO.println("Estudante: "+ (i+1));
        IO.print("Nome: ");
        String nome = sc.next();

        IO.print("Email: ");
        String email = sc.next();

        e[i] = new Estudante(nome, email);

        IO.print("Quarto: ");
        int quartoAlugar = sc.nextInt();

        if (q[quartoAlugar] == null) {
            q[quartoAlugar] = new Quartos(quartoAlugar, e[i]);
        }
    }

    quartosOcupados(q);
    sc.close();
}
