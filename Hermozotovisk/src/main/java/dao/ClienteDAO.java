/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Pessoa;
import repository.IClienteDAO;

/**
 *
 * @author luizportel4
 */
public class ClienteDAO implements IClienteDAO{
    public static List<Cliente> clientes = new ArrayList<>();   

    @Override
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public List<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public Cliente getClienteCPF(String cpf) {
        for (Cliente cliente : clientes) {
            if(cliente.getCPF().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
    
    @Override
    public void removeClient(int i) {
        clientes.remove(i);
    }
}
