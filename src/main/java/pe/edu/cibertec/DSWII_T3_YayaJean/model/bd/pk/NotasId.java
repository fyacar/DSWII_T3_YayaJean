package pe.edu.cibertec.DSWII_T3_YayaJean.model.bd.pk;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class NotasId implements Serializable {
    private String idAlumno;
    private String idCurso;

   
}
