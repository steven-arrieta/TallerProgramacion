package modelo.personas;

import modelo.abstractas.Persona;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private String grupoSanguineo;
    private List<String> alergias = new ArrayList<>();

    public Paciente(int id, String nombre, String apellido, LocalDate fechaNacimiento, String email, String grupoSanguineo) {
        super(id, nombre, apellido, fechaNacimiento, email);
        this.grupoSanguineo = grupoSanguineo;
    }

    public void agregarAlergia(String alergia) {
        alergias.add(alergia);
    }

    public List<String> getAlergias() {
        return new ArrayList<>(alergias);
    }

    @Override
    public String obtenerTipo() {
        return "Paciente";
    }
}