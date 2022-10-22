package controller;

import model.Cliente;
import model.Produto;

/**
 *
 * @author Gustavo
 */
public interface Busca {
    Produto buscarProdutoPorNome(String nome);
    
    Produto buscarProdutoPorCodigo(String codigo);
    
    Cliente buscarClientePorNome(String nome);
    
    Cliente buscarClientePorCPF(String CPF);
}

