package co.edu.univalle.services.estudiante;

import co.edu.univalle.database.entities.Estudiante;

import java.util.List;

public interface EstudianteService {
    List<String> getAllAreaUbicacion();
    List<String> getAllCaracterColegio();
    List<String> getAllJornadaColegio();
    List<String> getAllEstrato();
    List<Character> getAllGenero();
    List<String> getAllMunicipio();
    Estudiante findById(String id);
    List<Estudiante> findByPeriodo(Integer periodo);
    List<Estudiante> findByPeriodoAndUbicacion(Integer periodo, String ubicacion);
    List<Estudiante> findByPeriodoAndColeBilingue(Integer periodo, String bilingue);
    List<Estudiante> findByPeriodoAndColeCaracter(Integer periodo, String caracter);
    List<Estudiante> findByPeriodoAndJornada(Integer periodo, String jornada);
    List<Estudiante> findByPeriodoAndGenero(Integer periodo, Character genero);
    List<Estudiante> findByPeriodoAndMunicipio(Integer periodo, String municipio);
    List<Estudiante> findByPeriodoAndInternet(Integer periodo, String internet);
    List<Estudiante> findByAll();
}
