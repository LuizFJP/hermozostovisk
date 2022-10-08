/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mycompany.cadastropaciente.cadpaciente.Consulta;
import com.mycompany.cadastropaciente.cadpaciente.Paciente;
import java.util.ArrayList;
import java.util.List;
import repositorio.PacienteRepositorio;

/**
 *
 * @author luizportel4
 */
public class PacienteDAO implements PacienteRepositorio {
private List<Paciente>pacientes = new ArrayList<>();
        
    @Override
    public List<Paciente> getPacientes() {
        return this.pacientes;
    }

    @Override
    public void salavarPaciente(Paciente p) {
        this.pacientes.add(p);
    }
    
}
