/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Admin;
import model.Cliente;
import model.Funcionario;

/**
 *
 * @author luizportel4
 */
public class FuncionarioRepository {
  
    List<Funcionario> funcionarios;

    public FuncionarioRepository() {
        this.funcionarios = new ArrayList<>();
        this.populateAdmin();
    }

    public void addFuncionario(Funcionario usuario) {
        this.funcionarios.add(usuario);
    }

    private void populateAdmin() {
        Admin[] admins = {
            new Admin("Gustavo", "01", "123"),
            new Admin("Luiz", "02", "123"),
            new Admin("Nicolas", "03", "123")
        };
        for (Admin admin : admins) {
            this.funcionarios.add(admin);
        }
    }

    public List<Funcionario> getUsuarios() {
        return this.funcionarios;
    }

}
