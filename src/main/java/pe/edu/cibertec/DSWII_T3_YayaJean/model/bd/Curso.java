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
@Table(name="curso")
public class Curso {
    @Id
    private String idCurso;

    private String nomCurso;
    private int credito;

    @OneToMany(mappedBy = "curso")
    private Set<Notas> notas;
}
