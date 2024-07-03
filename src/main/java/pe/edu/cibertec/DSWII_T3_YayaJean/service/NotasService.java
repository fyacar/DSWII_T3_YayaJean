package pe.edu.cibertec.DSWII_T3_YayaJean.service;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_YayaJean.model.bd.Notas;
import pe.edu.cibertec.DSWII_T3_YayaJean.model.dto.NotasDto;
import pe.edu.cibertec.DSWII_T3_YayaJean.repository.NotasRepository;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class NotasService implements INotasService{

    private NotasRepository notasRepository;
    private ModelMapper modelMapper;

    @Override
    public List<NotasDto> listarNotasDto() {
        List<Notas> notasList = notasRepository.findAll();
        return notasList.stream()
                .map(this::convertirANotasDto)
                .collect(Collectors.toList());
    }
    public NotasDto convertirANotasDto(Notas notas) {
        NotasDto notasDto = modelMapper.map(notas, NotasDto.class);
        notasDto.setNombreCurso(notas.getCurso().getNomCurso());
        notasDto.setApellidoAlumno(notas.getAlumno().getApeAlumno());
        notasDto.setNombreAlumno(notas.getAlumno().getNomAlumno());
        return notasDto;
    }
}
