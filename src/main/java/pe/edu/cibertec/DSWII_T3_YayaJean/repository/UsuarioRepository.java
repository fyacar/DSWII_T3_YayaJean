package pe.edu.cibertec.DSWII_T3_YayaJean.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_YayaJean.model.bd.Usuario;

@Repository
public interface UsuarioRepository
    extends JpaRepository<Usuario, Integer> {
    Usuario findByNomusuario(String nomusuario);
}
