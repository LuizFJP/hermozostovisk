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
public class Admin extends Pessoa {

    public Admin(String nome, String cpf, String senha) {
        super(nome, cpf, senha);
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

}
