package co.edu.univalle.controllers;

import co.edu.univalle.services.estudiante.EstudianteService;
import co.edu.univalle.services.filter.FilterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Arrays;
import java.util.List;

@Slf4j
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/estudiante")
public class ControllerEstudiante {
    @Autowired
    EstudianteService estudianteService;
    @Autowired
    FilterService filterService;

    @GetMapping()//query param
    public ResponseEntity<?> getAllEstudianteByParams
            (@RequestParam(required = false) Integer periodo, @RequestParam(required = false) String coleAreaUbicacion, @RequestParam(required = false) String coleBilingue,
             @RequestParam(required = false) String coleCaracter,@RequestParam(required = false) String coleJornada, @RequestParam(required = false) Character genero,
             @RequestParam(required = false) String municipio, @RequestParam(required = false) String accesoInternet) {

        try {
            List<Object> params = Arrays.asList(periodo,coleAreaUbicacion, coleBilingue, coleCaracter, coleJornada, genero,
                    municipio, accesoInternet);

            if (filterService.validateParams(params)) {
                List<Object> response = filterService.filterHandler(params);
                if(response.isEmpty()) return ResponseEntity.notFound().build();
                return ResponseEntity.ok(response);
            }

        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

        return ResponseEntity.internalServerError().build();
    }

    @GetMapping("/municipio")
    public ResponseEntity<?> getAllMunicipios() {
        return ResponseEntity.ok(estudianteService.getAllMunicipio());
    }

    @GetMapping("/areaUbicacion")
    public ResponseEntity<?> getAllAreaUbicacion() {
        return ResponseEntity.ok(estudianteService.getAllAreaUbicacion());
    }

    @GetMapping("/caracterColegio")
    public ResponseEntity<?> getAllCaracterColegio() {
        return ResponseEntity.ok(estudianteService.getAllCaracterColegio());
    }

    @GetMapping("/jornadaColegio")
    public ResponseEntity<?> getAllJornadaColegio() {
        return ResponseEntity.ok(estudianteService.getAllJornadaColegio());
    }

    @GetMapping("/estrato")
    public ResponseEntity<?> getAllEstrato() {
        return ResponseEntity.ok(estudianteService.getAllEstrato());
    }

    @GetMapping("/genero")
    public ResponseEntity<?> getAllGenero() {
        return ResponseEntity.ok(estudianteService.getAllGenero());
    }
}
