package br.udesc.prog2.hermozostoviski.controller;

import br.udesc.prog2.hermozostoviski.model.Produto;

/**
 *
 * @author Gustavo
 */
public interface Controle {
    Produto buscarProdutoPorNome(String nome);
}
