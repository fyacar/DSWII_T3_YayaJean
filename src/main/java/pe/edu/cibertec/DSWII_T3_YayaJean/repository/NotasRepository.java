package pe.edu.cibertec.DSWII_T3_YayaJean.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_YayaJean.model.bd.Notas;

@Repository
public interface NotasRepository extends JpaRepository<Notas,String> {
}
