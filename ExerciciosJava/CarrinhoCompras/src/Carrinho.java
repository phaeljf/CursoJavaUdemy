import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ItemCarrinho> itemCarrinho;


    public Carrinho() {
        itemCarrinho = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itemCarrinho.add(new ItemCarrinho(produto, quantidade));
    }

    public double getTotal() {
        double total = 0;
        for (ItemCarrinho item : itemCarrinho) {
            total += item.getQuantidade() * item.getProduto().getPreco();
        }
        return total;
    }

    public boolean finalizaCompra(){
        if (itemCarrinho.isEmpty()) {
            System.out.println("Carrinho Vazio");
            return false;
        }

        for  (ItemCarrinho item : itemCarrinho) {
            System.out.println("O produto " + item.getProduto().getNome() + "possui " + item.getProduto().getQuantidade() + " de itens");
            if (item.getProduto().reduzirEstoque(item.getQuantidade()) == false){
                System.out.println("Estoque insuficiente");
                return;
            } else {
                System.out.println("O produto " + item.getProduto().getNome() + " agora possui " + item.getProduto().getQuantidade() + " de itens");
            }
        }
        System.out.println("Compra finalizada! Total: R$ " + getTotal());
        return true;
    }

}
