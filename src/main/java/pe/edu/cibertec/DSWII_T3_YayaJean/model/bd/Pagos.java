package pe.edu.cibertec.DSWII_T3_YayaJean.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ciclo;
    private int nCuota;
    private Double monto;
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "idAlumno")
    private Alumno alumno;

}
