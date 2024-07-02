package pe.edu.cibertec.DSWII_T3_YayaJean.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="alumno")
public class Alumno {
    @Id
    private String idAlumno;
    private String apeAlumno;
    private String nomAlumno;
    private char proce;

    @ManyToOne
    @JoinColumn(name = "idEsp")
    private Especialidad especialidad;

    @OneToMany(mappedBy = "alumno")
    private Set<Notas> notas;

    @OneToMany(mappedBy = "alumno")
    private Set<Pagos> pagos;

}
