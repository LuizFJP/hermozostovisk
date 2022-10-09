/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Produto;
import repository.ProdutoRepository;

/**
 *
 * @author luizportel4
 */
public class ProdutoDAO {
    ProdutoRepository produtoRepository = new ProdutoRepository();
    
    public void addProduto(Produto produto) {
        this.produtoRepository.addProduct(produto);
    }
    
    public List<Produto> getProdutos() {
        return this.produtoRepository.getProdutos();
    }
}
