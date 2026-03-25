package modelo.hospital;

import modelo.abstractas.Empleado; // ESTE FALTABA
import modelo.personas.Paciente;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Empleado> empleados = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();
    private List<CitaMedica> citas = new ArrayList<>();

    public void contratarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void registrarPaciente(Paciente p) {
        pacientes.add(p);
    }

    public void agendarCita(CitaMedica c) { //  ESTE MÉTODO FALTABA
        citas.add(c);
    }

    public void mostrarSalarios() {
        for (Empleado e : empleados) {
            System.out.println(e.obtenerTipo() + ": " + e.calcularSalario());
        }
    }
}
