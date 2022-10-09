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
public class ClienteRepository {
    List<Cliente> clientes;    

    public ClienteRepository() {
        this.clientes = new ArrayList<>();
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }


    public List<Cliente> getClientes() {
        return this.clientes;
    }
}
