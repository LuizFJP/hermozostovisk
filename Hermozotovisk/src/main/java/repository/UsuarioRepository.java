/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Admin;
import model.Pessoa;

/**
 *
 * @author luizportel4
 */
public class UsuarioRepository {

    List<Pessoa> usuarios;

    public UsuarioRepository() {
        this.usuarios = new ArrayList<>();
        this.populateAdmin();
    }

    public void addUsuario(Pessoa usuario) {
        this.usuarios.add(usuario);
    }

    private void populateAdmin() {
        Admin[] admins = {
            new Admin("Gustavo", "01", "123"),
            new Admin("Luiz", "02", "123"),
            new Admin("Nicolas", "03", "123")
        };
        for (Admin admin : admins) {
            this.usuarios.add(admin);
        }
    }

    public List<Pessoa> getUsuarios() {
        return this.usuarios;
    }

}
