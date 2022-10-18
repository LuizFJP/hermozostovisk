/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import repository.IFuncionario;

/**
 *
 * @author luizportel4
 */
public class Funcionario extends Pessoa implements IFuncionario {

    private String senha;
    public Funcionario(String nome, String cpf, String senha) {
        super(nome, cpf);
        this.senha = senha;
    }

    @Override
    public String getNome() {
        return super.nome;
    }

    @Override
    public String getCPF() {
        return super.cpf;
    }

    @Override
    public void setNome(String nome) {
        super.nome = nome;
    }

    @Override
    public boolean checarSenha(String senha) {
        if (senha.equals(this.senha)) {
            return true;
        }
        return false;
    }

}
