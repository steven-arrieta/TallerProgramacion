package modelo.personas;

import java.time.LocalDate;

public class Cirujano extends Medico {
    private int cirugiasRealizadas;

    public Cirujano(int id, String nombre, String apellido, LocalDate fechaNacimiento, String email,
                    int legajo, LocalDate fechaContratacion, double salarioBase, String especialidad, int cirugiasRealizadas) {
        super(id, nombre, apellido, fechaNacimiento, email, legajo, fechaContratacion, salarioBase, especialidad);
        this.cirugiasRealizadas = cirugiasRealizadas;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (cirugiasRealizadas * 50);
    }

    @Override
    public String obtenerTipo() {
        return "Cirujano";
    }
}