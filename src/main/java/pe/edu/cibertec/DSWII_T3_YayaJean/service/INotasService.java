package pe.edu.cibertec.DSWII_T3_YayaJean.service;

import pe.edu.cibertec.DSWII_T3_YayaJean.model.bd.Notas;
import pe.edu.cibertec.DSWII_T3_YayaJean.model.dto.NotasDto;

import java.util.List;

public interface INotasService {
    List<NotasDto> listarNotasDto();
    NotasDto convertirANotasDto(Notas notas);
}
