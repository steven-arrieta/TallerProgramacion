package modelo.personas;

import modelo.abstractas.Empleado;
import java.time.LocalDate;

public class Medico extends Empleado {
    protected String especialidad;

    public Medico(int id, String nombre, String apellido, LocalDate fechaNacimiento, String email,
                  int legajo, LocalDate fechaContratacion, double salarioBase, String especialidad) {
        super(id, nombre, apellido, fechaNacimiento, email, legajo, fechaContratacion, salarioBase);
        this.especialidad = especialidad;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (antiguedad() * 100);
    }

    @Override
    public String obtenerTipo() {
        return "Medico";
    }
}