package entities;

public class Quartos {

    private int numero;
    Estudante estudante;
    Boolean ocupado;


    public Quartos(int numero, Estudante estudante) {
        this.numero = numero;
        this.estudante = estudante;
        this.ocupado = true;
    }

    public int getNumero() {
        return numero;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public void mudarEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public void desocuparQuarto() {
        this.ocupado = false;
    }

    public void mudancaDeQuarto(Estudante estudante, Quartos novoQuarto) {
        novoQuarto.mudarEstudante(this.estudante);
        mudarEstudante(estudante);
    }

    @Override
    public String toString() {
        return "Quartos{" +
                "numero=" + numero +
                ", estudante=" + estudante +
                ", ocupado=" + ocupado +
                '}';
    }

    public static void quartosOcupados(Quartos[] q) {
        System.out.println("Quartos ocupados:");

        for (int i = 0; i < q.length; i++) {
            if (q[i] != null) {
                System.out.printf("%d: %s, %s%n",
                        q[i].getNumero(),
                        q[i].getEstudante().getNome(),
                        q[i].getEstudante().getEmail());
            }
        }
    }

}
