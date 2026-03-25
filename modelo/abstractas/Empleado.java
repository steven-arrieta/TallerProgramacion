package modelo.abstractas;

import java.time.LocalDate;

public abstract class Empleado extends Persona {
    protected int legajo;
    protected LocalDate fechaContratacion;
    protected double salarioBase;

    public Empleado(int id, String nombre, String apellido, LocalDate fechaNacimiento, String email,
                    int legajo, LocalDate fechaContratacion, double salarioBase) {
        super(id, nombre, apellido, fechaNacimiento, email);
        this.legajo = legajo;
        this.fechaContratacion = fechaContratacion;
        this.salarioBase = salarioBase;
    }

    public int antiguedad() {
        return LocalDate.now().getYear() - fechaContratacion.getYear();
    }

    public abstract double calcularSalario();
}