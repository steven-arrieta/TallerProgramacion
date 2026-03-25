package modelo.personas;

import modelo.abstractas.Empleado;
import modelo.enums.Turno;
import java.time.LocalDate;

public class Enfermero extends Empleado {
    private Turno turno;

    public Enfermero(int id, String nombre, String apellido, LocalDate fechaNacimiento, String email,
                     int legajo, LocalDate fechaContratacion, double salarioBase, Turno turno) {
        super(id, nombre, apellido, fechaNacimiento, email, legajo, fechaContratacion, salarioBase);
        this.turno = turno;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 200;
    }

    @Override
    public String obtenerTipo() {
        return "Enfermero";
    }
}