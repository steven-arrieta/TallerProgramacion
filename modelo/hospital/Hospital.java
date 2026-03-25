package modelo.hospital;

import modelo.personas.*;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Empleado> empleados = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();

    public void contratarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void registrarPaciente(Paciente p) {
        pacientes.add(p);
    }

    public void mostrarSalarios() {
        for (Empleado e : empleados) {
            System.out.println(e.obtenerTipo() + ": " + e.calcularSalario());
        }
    }
}