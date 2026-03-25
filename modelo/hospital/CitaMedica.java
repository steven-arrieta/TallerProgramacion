package modelo.hospital;

import modelo.personas.Medico;
import modelo.personas.Paciente;
import modelo.enums.EstadoCita;
import java.time.LocalDateTime;

public class CitaMedica {
    private int id;
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime fecha;
    private EstadoCita estado;
    private String diagnostico;

    public CitaMedica(int id, Paciente paciente, Medico medico, LocalDateTime fecha) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.estado = EstadoCita.PENDIENTE;
    }

    public void completar(String diagnostico) {
        this.diagnostico = diagnostico;
        this.estado = EstadoCita.COMPLETADA;
    }

    public void cancelar() {
        this.estado = EstadoCita.CANCELADA;
    }
}