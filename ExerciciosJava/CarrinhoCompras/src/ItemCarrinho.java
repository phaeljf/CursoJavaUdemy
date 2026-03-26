public class ItemCarrinho {
    private Produto produto;
    private int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        if (quantidade > produto.getQuantidade()) {
            throw new IllegalArgumentException("Quantidade maior que estoque!");
        }
        this.produto = produto;
        this.quantidade = quantidade;

    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
