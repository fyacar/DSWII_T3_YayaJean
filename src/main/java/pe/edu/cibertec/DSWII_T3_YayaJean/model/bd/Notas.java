package pe.edu.cibertec.DSWII_T3_YayaJean.model.bd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pe.edu.cibertec.DSWII_T3_YayaJean.model.bd.pk.NotasId;

@Getter
@Setter
@Entity
@Table(name="notas")
public class Notas {

    @EmbeddedId
    private NotasId id;

    private double exaParcial;
    private double exaFinal;

    @ManyToOne
    @MapsId("idAlumno")
    @JoinColumn(name = "idAlumno")
    @JsonBackReference
    private Alumno alumno;

    @ManyToOne
    @MapsId("idCurso")
    @JoinColumn(name = "idCurso")
    @JsonBackReference
    private Curso curso;

}

