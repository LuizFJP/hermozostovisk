/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Pessoa;
import repository.UsuarioRepository;

/**
 *
 * @author luizportel4
 */
public class UsuarioDAO {
    private UsuarioRepository usuarioRepository;

    public UsuarioDAO() {
       this.usuarioRepository = new UsuarioRepository();
    }
    
    public Pessoa getUsuario(String cpf, String senha) {
        List<Pessoa> usuarios = this.usuarioRepository.getUsuarios();
        for (Pessoa usuario : usuarios) {
            if(cpf.equals(usuario.getCPF()) && usuario.checarSenha(senha)){
                return usuario;
            }
        }
        return null;
    }
    
    public void addUsuario(Pessoa usuario) {
        this.usuarioRepository.addUsuario(usuario);
    }
    
}
