public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean reduzirEstoque(int quantidade) {
        if (this.quantidade < quantidade) {
            return false;
        } else {
            this.quantidade -= quantidade;
            return true;
        }
    }


}
