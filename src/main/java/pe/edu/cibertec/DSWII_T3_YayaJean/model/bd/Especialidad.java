package pe.edu.cibertec.DSWII_T3_YayaJean.model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="especialidad")
public class Especialidad {
    @Id
    private String idEsp;

    private String nomEsp;
    private Double costo;

    @OneToMany(mappedBy = "especialidad")
    private Set<Alumno> alumnos;


}
