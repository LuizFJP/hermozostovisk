/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import model.Funcionario;
import model.Pessoa;

/**
 *
 * @author luizportel4
 */
public interface IFuncionarioDAO {
    public void addFuncionario(Funcionario funcionario);
    public List<Funcionario> getFuncionarios();
}
