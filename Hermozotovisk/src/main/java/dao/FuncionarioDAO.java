/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Admin;
import model.Funcionario;
import model.Pessoa;
import repository.IFuncionarioDAO;

/**
 *
 * @author luizportel4
 */
public class FuncionarioDAO implements IFuncionarioDAO {
    public static List<Funcionario> funcionarios = new ArrayList<>();

    public FuncionarioDAO() {
        this.populateAdmin();  
    }

    @Override
    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
     
    public Funcionario findFuncionario(String cpf, String senha) {
        for (Funcionario funcionario : funcionarios) {
            if(cpf.equals(funcionario.getCPF()) && funcionario.checarSenha(senha)){
                return funcionario;
            }
        }
        return null;
    }    
  
    private void populateAdmin() {
        Admin[] admins = {
            new Admin("Gustavo", "01", "123"),
            new Admin("Luiz", "02", "123"),
            new Admin("Nicolas", "03", "123")
        };
        for (Admin admin : admins) {
            funcionarios.add(admin);
        }
    }
}
