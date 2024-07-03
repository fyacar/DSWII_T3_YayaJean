package pe.edu.cibertec.DSWII_T3_YayaJean.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.cibertec.DSWII_T3_YayaJean.model.dto.ArchivoDto;
import pe.edu.cibertec.DSWII_T3_YayaJean.model.dto.NotasDto;
import pe.edu.cibertec.DSWII_T3_YayaJean.service.FileService;
import pe.edu.cibertec.DSWII_T3_YayaJean.service.INotasService;
import pe.edu.cibertec.DSWII_T3_YayaJean.service.NotasService;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1")
public class Pregunta3Controller {
    private FileService fileService;
    private INotasService notasService;


    @PreAuthorize("hasRole('Administrador')")
    @PostMapping("/filesdoc")
    public ResponseEntity<ArchivoDto> subirArchivos(
           @RequestParam("files") List<MultipartFile> multipartFileList
    ) throws Exception {
        for (MultipartFile file : multipartFileList) {

            // Validando extensión del archivo
            if (!file.getOriginalFilename().endsWith(".doc")) {
                return new ResponseEntity<>(ArchivoDto.builder()
                        .mensaje("Solo se permiten archivos con extensión .doc").build(),
                        HttpStatus.BAD_REQUEST);
            }

            // Validando tamaño del archivo
            if (file.getSize() > 2 * 1024 * 1024) {
                return new ResponseEntity<>(ArchivoDto.builder()
                        .mensaje("El tamaño máximo del archivo es 2MB").build(),
                        HttpStatus.BAD_REQUEST);
            }
        }

        fileService.guardarArchivos(multipartFileList);
        return new ResponseEntity<>(ArchivoDto.builder()
                .mensaje("Archivos subidos correctamente").build(),
                HttpStatus.OK);

    }

    @PreAuthorize("hasRole('Supervisor')")
    @GetMapping("/pubs-dto")
    public ResponseEntity<List<NotasDto>> obtenerNotasDto() {
        List<NotasDto> notasDtoList = notasService.listarNotasDto();
        return ResponseEntity.ok(notasDtoList);
    }


}
