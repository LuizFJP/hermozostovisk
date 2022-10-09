/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import interfaces.IPessoa;

/**
 *
 * @author luizportel4
 */
public abstract class Pessoa implements IPessoa {
    protected String nome;
    protected String cpf;
    protected String senha;

    public Pessoa(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    @Override
    public abstract String getNome();

    @Override
    public abstract String getCPF();

    @Override
    public abstract void setNome(String nome);
   
    
    @Override
    public boolean checarSenha(String senha) {
        if (senha.equals(this.senha)) {
            return true;
        } 
        return false;
    }

}
