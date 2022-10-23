/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luizportel4
 */
public class Vendedor extends Funcionario {

    public Vendedor(String nome, String cpf, String senha) {
        super(nome, cpf, senha);
    }
    @Override
    public String toString() {
        return this.nome;
    }
}
