/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import com.mycompany.cadastropaciente.cadpaciente.Consulta;
import com.mycompany.cadastropaciente.cadpaciente.Paciente;
import java.util.List;

/**
 *
 * @author luizportel4
 */
public interface PacienteRepositorio {
        List<Paciente> getPacientes();
        void salavarPaciente(Paciente p);
}
