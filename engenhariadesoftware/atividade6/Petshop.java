import java.util.LinkedList;
import java.util.List;

public class Petshop {

    private List<Produto> produtos = new LinkedList<Produto>();

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> buscarNomeProduto (String nome){
        List<Produto> encontrados = new LinkedList<Produto>();
        for(Produto produto:produtos){
            if(produto.getNome().equals(nome))
                encontrados.add(produto);
        }
    return encontrados;
    }

    public List<Produto> buscarProdutosNomePet(Produto prod){
        List<Produto> encontrados = new LinkedList<Produto>();
        for(Produto produto:produtos){
            if (produto.comparar(prod)) encontrados.add(produto);
        }
    return encontrados;
    }

    public List<Produto> getProdutos(){
        return produtos;
    }
}