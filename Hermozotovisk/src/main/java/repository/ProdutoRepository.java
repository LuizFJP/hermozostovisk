/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        return this.produtos;
    }
    
    public void removeProduto(Produto produto){
        this.produtos.remove(produto);
    }
}
