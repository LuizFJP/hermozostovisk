package repository;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author luizportel4
 */
public class ProdutoRepository {
    List<Produto> produtos;

    public ProdutoRepository() {
        this.produtos = new ArrayList<>();
    }
    
    public void addProduct(Produto produto) {
        this.produtos.add(produto);
    }
    
    public List<Produto> getProdutos() {
        return (this.produtos);
    }
}
