/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import model.Cliente;

/**
 *
 * @author luizportel4
 */
public interface IClienteDAO {
    public void addCliente(Cliente cliente);
    public List<Cliente> getClientes();
    public Cliente getClienteCPF(String cpf);
    public void removeClient(int i);
}
