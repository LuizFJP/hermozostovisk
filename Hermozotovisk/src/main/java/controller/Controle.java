package controller;

import model.Produto;

/**
 *
 * @author Gustavo
 */
public interface Controle {
    Produto buscarProdutoPorNome(String nome);
}
