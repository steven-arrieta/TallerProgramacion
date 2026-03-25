package modelo.abstractas;

import java.time.LocalDate;

public abstract class Persona {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected LocalDate fechaNacimiento;
    protected String email;

    public Persona(int id, String nombre, String apellido, LocalDate fechaNacimiento, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
    }

    public int calcularEdad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }

    public abstract String obtenerTipo();
}
