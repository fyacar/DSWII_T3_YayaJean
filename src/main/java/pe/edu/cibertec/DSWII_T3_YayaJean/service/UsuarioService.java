package pe.edu.cibertec.DSWII_T3_YayaJean.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_YayaJean.model.bd.Usuario;
import pe.edu.cibertec.DSWII_T3_YayaJean.repository.UsuarioRepository;
import pe.edu.cibertec.DSWII_T3_YayaJean.model.bd.Usuario;

@AllArgsConstructor
@Service
public class UsuarioService implements IUsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
}
