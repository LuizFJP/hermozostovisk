package controller;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Cliente;
import model.Produto;

/**
 *
 * @author Gustavo
 */
public interface Controller {
    Produto buscarProdutoPorNome(String nome);
    
    Produto buscarProdutoPorCodigo(int codigo);
    
    Cliente buscarClientePorNome(String nome);
    
    Cliente buscarClientePorCPF(String CPF);
    
    void mensagem(String mensagem);
    
    void limpaCampo(JTextField textField);
    
    void limpaCampo(JTextArea textArea);
}

