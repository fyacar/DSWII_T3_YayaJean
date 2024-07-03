package pe.edu.cibertec.DSWII_T3_YayaJean.model.dto;

import lombok.Data;

@Data
public class NotasDto implements DtoEntity {
    private Double exaparcial;
    private Double exafinal;
    private String nombreCurso;
    private String apellidoAlumno;
    private String nombreAlumno;
}
