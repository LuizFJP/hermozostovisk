/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author luizportel4
 */
public interface IPessoa {
    public String getNome();
    public String getCPF();
    public boolean checarSenha(String senha);
    public void setNome(String nome);
}
