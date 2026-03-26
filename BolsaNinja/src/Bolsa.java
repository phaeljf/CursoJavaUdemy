import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bolsa<T> {

    private List<T> itens = new ArrayList<>();


    public void adicionar(T item){
        itens.add(item);
    }

    public T pegar(int index){
        return itens.get(index);
    }

    public int quantidade(){
        return itens.size();
    }

    public List<T> getItens(){
        return Collections.unmodifiableList(itens);
    }

    public void listar(){
        for(T item : itens){
            System.out.println(item);
        }
    }

}