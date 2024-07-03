package pe.edu.cibertec.DSWII_T3_YayaJean.service;

import pe.edu.cibertec.DSWII_T3_YayaJean.model.bd.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario);
}
