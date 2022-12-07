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
    public List<Estudiante> findByPeriodoAndColeBilingue(Integer periodo, String bilingue) {
        return estudianteRepository.findByPeriodoAndColeBilingue(periodo,bilingue).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeCaracter(Integer periodo, String caracter) {
        return estudianteRepository.findByPeriodoAndColeCaracter(periodo,caracter).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndJornada(Integer periodo, String jornada) {
        return estudianteRepository.findByPeriodoAndColeJornada(periodo,jornada).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndGenero(Integer periodo, Character genero) {
        return estudianteRepository.findByPeriodoAndGenero(periodo,genero).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndMunicipio(Integer periodo, String municipio) {
        return estudianteRepository.findByPeriodoAndMunicipio(periodo,municipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndInternet(Integer periodo, String internet) {
        return estudianteRepository.findByPeriodoAndAccesoInternet(periodo,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndBilingue(Integer periodo, String ubicacion, String bilingue) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeBilingue
                (periodo,ubicacion,bilingue).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndCaracter(Integer periodo, String ubicacion, String caracter) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeCaracter
                (periodo,ubicacion,caracter).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndJornada(Integer periodo, String ubicacion, String jornada) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeJornada
                (periodo,ubicacion,jornada).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndGenero(Integer periodo, String ubicacion, Character genero) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndGenero
                (periodo,ubicacion,genero).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndMunicipio(Integer periodo, String ubicacion, String municipio) {
       return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndMunicipio
                (periodo,ubicacion,municipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndInternet(Integer periodo, String ubicacion, String internet) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndAccesoInternet
                (periodo,ubicacion,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndCaracter(Integer periodo, String bilingue, String caracter) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndColeCaracter
                (periodo,bilingue,caracter).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndJornada(Integer periodo, String bilingue, String jornada) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndColeJornada
                (periodo,bilingue,jornada).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndGenero(Integer periodo, String bilingue, Character genero) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndGenero
                (periodo,bilingue,genero).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndMunicipio(Integer periodo, String bilingue, String municipio) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndMunicipio
                (periodo,bilingue,municipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndInternet(Integer periodo, String bilingue, String internet) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndAccesoInternet
                (periodo,bilingue,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndCaracterAndJornada(Integer periodo, String caracter, String jornada) {
        return estudianteRepository.findByPeriodoAndColeCaracterAndColeJornada
                (periodo,caracter,jornada).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndCaracterAndGenero(Integer periodo, String caracter, Character genero) {
        return estudianteRepository.findByPeriodoAndColeCaracterAndGenero
                (periodo,caracter,genero).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndCaracterAndMunicipio(Integer periodo, String caracter, String municipio) {
        return estudianteRepository.findByPeriodoAndColeCaracterAndMunicipio
                (periodo,caracter,municipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndCaracterAndInternet(Integer periodo, String caracter, String internet) {
        return estudianteRepository.findByPeriodoAndColeCaracterAndAccesoInternet
                (periodo,caracter,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndJornadaAndGenero(Integer periodo, String jornada, Character genero) {
        return estudianteRepository.findByPeriodoAndColeJornadaAndGenero
                (periodo,jornada,genero).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndJornadaAndMunicipio(Integer periodo, String jornada, String municipio) {
        return estudianteRepository.findByPeriodoAndColeJornadaAndMunicipio
                (periodo,jornada,municipio).orElse(Collections.emptyList());

    }

    @Override
    public List<Estudiante> findByPeriodoAndJornadaAndInternet(Integer periodo, String jornada, String internet) {
        return estudianteRepository.findByPeriodoAndColeJornadaAndAccesoInternet
                (periodo,jornada,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndGeneroAndMunicipio(Integer periodo, Character genero, String municipio) {
        return estudianteRepository.findByPeriodoAndGeneroAndMunicipio
                (periodo,genero,municipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndGeneroAndInternet(Integer periodo, Character genero, String internet) {
        return estudianteRepository.findByPeriodoAndGeneroAndAccesoInternet
                (periodo,genero,internet).orElse(Collections.emptyList());

    }

    @Override
    public List<Estudiante> findByPeriodoAndMunicipioAndInternet(Integer periodo, String municipio, String internet) {
        return estudianteRepository.findByPeriodoAndMunicipioAndAccesoInternet
                (periodo,municipio,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndBilingueAndCaracter(Integer periodo, String ubicacion, String bilingue, String caracter) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeBilingueAndColeCaracter
                (periodo,ubicacion,bilingue,caracter).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndBilingueAndJornada(Integer periodo, String ubicacion, String bilingue, String jornada) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeBilingueAndColeJornada
                (periodo,ubicacion,bilingue,jornada).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndBilingueAndGenero(Integer periodo, String ubicacion, String bilingue, Character genero) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeBilingueAndGenero
                (periodo,ubicacion,bilingue,genero).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndBilingueAndMunicipio(Integer periodo, String ubicacion, String bilingue, String municipio) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeBilingueAndMunicipio
                (periodo,ubicacion,bilingue,municipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndBilingueAndInternet(Integer periodo, String ubicacion, String bilingue, String internet) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeBilingueAndAccesoInternet
                (periodo,ubicacion,bilingue,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndCaracterAndJornada(Integer periodo, String ubicacion, String caracter, String jornada) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeCaracterAndColeJornada
                (periodo,ubicacion,caracter,jornada).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndCaracterAndGenero(Integer periodo, String ubicacion, String caracter, Character genero) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeCaracterAndGenero
                (periodo,ubicacion,caracter,genero).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndCaracterAndMunicipio(Integer periodo, String ubicacion, String caracter, String municipio) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeCaracterAndMunicipio
                (periodo,ubicacion,caracter,municipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndCaracterAndInternet(Integer periodo, String ubicacion, String caracter, String internet) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeCaracterAndAccesoInternet
                (periodo,ubicacion,caracter,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndJornadaAndGenero(Integer periodo, String ubicacion, String jornada, Character genero) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeJornadaAndGenero
                (periodo,ubicacion,jornada,genero).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndJornadaAndMunicipio(Integer periodo, String ubicacion, String jornada, String municipio) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeJornadaAndMunicipio
                (periodo,ubicacion,jornada,municipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndJornadaAndInternet(Integer periodo, String ubicacion, String jornada, String internet) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndColeJornadaAndAccesoInternet
                (periodo,ubicacion,jornada,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndGeneroAndMunicipio(Integer periodo, String ubicacion, Character genero, String municipio) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndGeneroAndMunicipio
                (periodo,ubicacion,genero,municipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndGeneroAndInternet(Integer periodo, String ubicacion, Character genero, String internet) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndGeneroAndAccesoInternet
                (periodo,ubicacion,genero,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndUbicacionAndMunicipioAndInternet(Integer periodo, String ubicacion, String municipio, String internet) {
        return estudianteRepository.findByPeriodoAndColeAreaUbicacionAndMunicipioAndAccesoInternet
                (periodo,ubicacion,municipio,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndCaracterAndJornada(Integer periodo, String bilingue, String caracter, String jornada) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndColeCaracterAndColeJornada
                (periodo,bilingue,caracter,jornada).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndCaracterAndGenero(Integer periodo, String bilingue, String caracter, Character genero) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndColeCaracterAndGenero
                (periodo,bilingue,caracter,genero).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndCaracterAndMunicipio(Integer periodo, String bilingue, String caracter, String muncipio) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndColeCaracterAndMunicipio
                (periodo,bilingue,caracter,muncipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndCaracterAndInternet(Integer periodo, String bilingue, String caracter, String internet) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndColeCaracterAndAccesoInternet
                (periodo,bilingue,caracter,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndJornadaAndGenero(Integer periodo, String bilingue, String jornada, Character genero) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndColeJornadaAndGenero
                (periodo,bilingue,jornada,genero).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndJornadaAndMunicipio(Integer periodo, String bilingue, String jornada, String municipio) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndColeJornadaAndMunicipio
                (periodo,bilingue,jornada,municipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndGeneroAndMunicipio(Integer periodo, String bilingue, Character genero, String municipio) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndGeneroAndMunicipio
                (periodo,bilingue,genero,municipio).orElse(Collections.emptyList());
    }
    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndJornadaAndInternet(Integer periodo, String bilingue, String jornada, String internet) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndColeJornadaAndAccesoInternet
                (periodo,bilingue,jornada,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndGeneroAndInternet(Integer periodo, String bilingue, Character genero, String internet) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndGeneroAndAccesoInternet
                (periodo,bilingue,genero,internet).orElse(Collections.emptyList());
    }



    @Override
    public List<Estudiante> findByPeriodoAndColeBilingueAndMunicipioAndInternet(Integer periodo, String bilingue, String municipio, String internet) {
        return estudianteRepository.findByPeriodoAndColeBilingueAndMunicipioAndAccesoInternet
                (periodo,bilingue,municipio,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeCaracterAndJornadaAndGenero(Integer periodo, String caracter, String jornada, Character genero) {
        return estudianteRepository.findByPeriodoAndColeCaracterAndColeJornadaAndGenero
                (periodo,caracter,jornada,genero).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeCaracterAndJornadaAndMunicipio(Integer periodo, String caracter, String jornada, String municipio) {
        return estudianteRepository.findByPeriodoAndColeCaracterAndColeJornadaAndMunicipio
                (periodo,caracter,jornada,municipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeCaracterAndJornadaAndInternet(Integer periodo, String caracter, String jornada, String internet) {
        return estudianteRepository.findByPeriodoAndColeCaracterAndColeJornadaAndAccesoInternet
                (periodo,caracter,jornada,internet).orElse(Collections.emptyList());
    }


    @Override
    public List<Estudiante> findByPeriodoAndColeCaracterAndGeneroAndMunicipio(Integer periodo, String caracter, Character genero, String municipio) {
        return estudianteRepository.findByPeriodoAndColeCaracterAndGeneroAndMunicipio
                (periodo,caracter,genero,municipio).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndColeCaracterAndGeneroAndInternet(Integer periodo, String caracter, Character genero, String internet) {
        return estudianteRepository.findByPeriodoAndColeCaracterAndGeneroAndAccesoInternet
                (periodo,caracter,genero,internet).orElse(Collections.emptyList());
    }
    @Override
    public List<Estudiante> findByPeriodoAndColeCaracterAndMunicipioAndInternet(Integer periodo, String caracter, String municipio, String internet) {
        return estudianteRepository.findByPeriodoAndColeCaracterAndMunicipioAndAccesoInternet
                (periodo,caracter,municipio,internet).orElse(Collections.emptyList());
    }


    @Override
    public List<Estudiante> findByPeriodoAndColeJornadaAndGeneroAndMunicipio(Integer periodo, String jornada, Character genero, String municipio) {
        return estudianteRepository.findByPeriodoAndColeJornadaAndGeneroAndMunicipio
                (periodo,jornada,genero,municipio).orElse(Collections.emptyList());
    }
    @Override
    public List<Estudiante> findByPeriodoAndColeJornadaAndGeneroAndInternet(Integer periodo, String jornada, Character genero, String internet) {
        return estudianteRepository.findByPeriodoAndColeJornadaAndGeneroAndAccesoInternet
                (periodo,jornada,genero,internet).orElse(Collections.emptyList());
    }


    @Override
    public List<Estudiante> findByPeriodoAndColeJornadaAndMunicipioAndInternet(Integer periodo, String jornada, String municipio, String internet) {
        return estudianteRepository.findByPeriodoAndColeJornadaAndMunicipioAndAccesoInternet
                (periodo,jornada,municipio,internet).orElse(Collections.emptyList());
    }

    @Override
    public List<Estudiante> findByPeriodoAndMunicipioAndGeneroAndInternet(Integer periodo, String municipio, Character genero, String internet) {
        return estudianteRepository.findByPeriodoAndMunicipioAndGeneroAndAccesoInternet
                (periodo,municipio,genero,internet).orElse(Collections.emptyList());
    }


}
