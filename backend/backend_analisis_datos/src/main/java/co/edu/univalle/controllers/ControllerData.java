package co.edu.univalle.controllers;

import co.edu.univalle.database.repositories.IcfesDataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Arrays;

@Slf4j
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/data")
public class ControllerData {
    @Autowired
    IcfesDataRepository icfesDataRepository;
    @GetMapping("/mix")//mix?saludo
    public ResponseEntity<?> mix(@RequestParam(required = false) String saludo, @RequestParam String nombre) {
        return ResponseEntity.ok(Arrays.asList(saludo,nombre));
    }

    @GetMapping("/municipio")
    public ResponseEntity<?> getAllMunicipios() {
        return ResponseEntity.ok(icfesDataRepository.findAllMunicipios());
    }

    @GetMapping("/areaUbicacion")
    public ResponseEntity<?> getAllAreaUbicacion() {
        return ResponseEntity.ok(icfesDataRepository.findAllAreaUbicacion());
    }

    @GetMapping("/tipoColegio")
    public ResponseEntity<?> getAllTipoColegio() {
        return ResponseEntity.ok(icfesDataRepository.findAllTipoColegio());
    }
}
