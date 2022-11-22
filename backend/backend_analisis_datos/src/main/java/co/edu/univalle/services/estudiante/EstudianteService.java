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
    List<Estudiante> findByAll();
}
