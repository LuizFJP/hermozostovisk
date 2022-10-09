/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Funcionario;
import model.Pessoa;
import repository.FuncionarioRepository;

/**
 *
 * @author luizportel4
 */
public class FuncionarioDAO {
    private FuncionarioRepository funcionariosRepository;

    public FuncionarioDAO() {
       this.funcionariosRepository = new FuncionarioRepository();
    }
    
    public Funcionario getFuncionario(String cpf, String senha) {
        List<Funcionario> funcionarios = this.funcionariosRepository.getUsuarios();
        for (Funcionario funcionario : funcionarios) {
            if(cpf.equals(funcionario.getCPF()) && funcionario.checarSenha(senha)){
                return funcionario;
            }
        }
        return null;
    }
    
    public void addFuncionario(Funcionario usuario) {
        this.funcionariosRepository.addFuncionario(usuario);
    }
    
}
