/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Cliente;
import model.Funcionario;
import repository.ClienteRepository;

/**
 *
 * @author luizportel4
 */
public class ClienteDAO {
    private ClienteRepository clienteRepository;

    public ClienteDAO() {
       this.clienteRepository = new ClienteRepository();
    }
 
    public void addCliente(Cliente usuario) {
        this.clienteRepository.addCliente(usuario);
    }
}
