package co.edu.univalle.services.estudiante;

import co.edu.univalle.database.entities.Estudiante;
import co.edu.univalle.database.repositories.EstudianteRepository;
import co.edu.univalle.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstudianteServiceImpl implements EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<String> getAllAreaUbicacion() {
        HashSet<AreaUbicacion> allAreaUbicacion = estudianteRepository.findAllAreaUbicacion();
        return allAreaUbicacion.stream()
                .map(AreaUbicacion::getCOLE_AREA_UBICACION)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAllCaracterColegio() {
        HashSet<CaracterColegio> allCaracterColegio = estudianteRepository.findAllCaracterColegio();
        return allCaracterColegio.stream()
                .map(CaracterColegio::getCOLE_CARACTER)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAllJornadaColegio() {
        HashSet<JornadaColegio> allJornadaColegio = estudianteRepository.findAllJornadaColegio();
        return allJornadaColegio.stream()
                .map(JornadaColegio::getCOLE_JORNADA)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAllEstrato() {
        HashSet<Estrato> allEstrato = estudianteRepository.findAllEstrato();
        return allEstrato.stream()
                .map(Estrato::getFAMI_ESTRATOVIVIENDA)
                .collect(Collectors.toList());
    }

    @Override
    public List<Character> getAllGenero() {
        HashSet<Genero> allGenero = estudianteRepository.findAllGenero();
        return allGenero.stream()
                .map(Genero::getESTU_GENERO)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAllMunicipio() {
        HashSet<Municipio> allMunicipio = estudianteRepository.findAllMunicipio();
        return allMunicipio.stream()
                .map(Municipio::getESTU_MCPIO_RESIDE)
                .collect(Collectors.toList());
    }

    @Override
    public Estudiante findById(String id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Estudiante> findByPeriodo(Integer periodo) {
        return estudianteRepository.findByPeriodo(periodo).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacion(Integer periodo, String ubicacion) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacion(periodo,ubicacion).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByAll() {
        return estudianteRepository.findAll();
    }
}
