//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bolsa<Item> bolsaNinja = new Bolsa<>();

        bolsaNinja.adicionar(new Kunai());
        bolsaNinja.adicionar(new Shuriken());
        bolsaNinja.adicionar(new Pergaminho());

        bolsaNinja.listar();
        bolsaNinja.quantidade();
        bolsaNinja.pegar(2).descricao();


        System.out.println("=========================");

        imprimirLista(bolsaNinja);

    }

    public static <T> void imprimirLista(Bolsa<T> bolsa){

        for(T item : bolsa.getItens()){
            System.out.println(item);
        }

    }

}