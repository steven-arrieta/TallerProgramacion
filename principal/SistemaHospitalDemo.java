package principal;

import modelo.hospital.*;
import modelo.personas.*;
import modelo.enums.Turno;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SistemaHospitalDemo {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        Medico m = new Medico(1, "Juan", "Perez", LocalDate.of(1980,1,1),
                "m@correo.com", 101, LocalDate.of(2010,1,1), 2000, "General");

        Cirujano c = new Cirujano(2, "Ana", "Lopez", LocalDate.of(1975,1,1),
                "c@correo.com", 102, LocalDate.of(2005,1,1), 3000, "Cirugia", 20);

        Enfermero e = new Enfermero(3, "Luis", "Gomez", LocalDate.of(1990,1,1),
                "e@correo.com", 103, LocalDate.of(2018,1,1), 1500, Turno.NOCHE);

        Paciente p = new Paciente(10, "Carlos", "Diaz",
                LocalDate.of(2000,5,5), "p@correo.com", "O+");

        CitaMedica cita = new CitaMedica(1, p, m, LocalDateTime.now());

        hospital.contratarEmpleado(m);
        hospital.contratarEmpleado(c);
        hospital.contratarEmpleado(e);

        hospital.registrarPaciente(p);
        hospital.agendarCita(cita);

        hospital.mostrarSalarios();

        cita.completar("Gripe común");
    }
}