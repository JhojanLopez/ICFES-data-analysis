package co.edu.univalle.services.estudiante;

import co.edu.univalle.database.entities.Estudiante;

import java.util.List;

public interface EstudianteService {
    List<String> getAllAreaUbicacion();
    List<String> getAllCaracterColegio();
    List<String> getAllJornadaColegio();
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

    List<Estudiante> findByPeriodoAndUbicacionAndBilingue(Integer periodo, String internet, String bilingue);

    List<Estudiante> findByPeriodoAndUbicacionAndCaracter(Integer periodo, String ubicacion, String caracter);

    List<Estudiante> findByPeriodoAndUbicacionAndJornada(Integer periodo, String ubicacion, String caracter);

    List<Estudiante> findByPeriodoAndUbicacionAndGenero(Integer periodo, String ubicacion, Character genero);

    List<Estudiante> findByPeriodoAndUbicacionAndMunicipio(Integer periodo, String ubicacion, String municipio);

    List<Estudiante> findByPeriodoAndUbicacionAndInternet(Integer periodo, String ubicacion, String internet);

    List<Estudiante> findByPeriodoAndColeBilingueAndCaracter(Integer periodo, String bilingue, String caracter);

    List<Estudiante> findByPeriodoAndColeBilingueAndJornada(Integer periodo, String bilingue, String jornada);

    List<Estudiante> findByPeriodoAndColeBilingueAndGenero(Integer periodo, String ubicacion, Character genero);

    List<Estudiante> findByPeriodoAndColeBilingueAndMunicipio(Integer periodo, String bilingue, String municipio);

    List<Estudiante> findByPeriodoAndColeBilingueAndInternet(Integer periodo, String bilingue, String internet);

    List<Estudiante> findByPeriodoAndCaracterAndJornada(Integer periodo, String caracter, String jornada);

    List<Estudiante> findByPeriodoAndCaracterAndGenero(Integer periodo, String caracter, Character genero);

    List<Estudiante> findByPeriodoAndCaracterAndMunicipio(Integer periodo, String caracter, String municipio);

    List<Estudiante> findByPeriodoAndCaracterAndInternet(Integer periodo, String caracter, String internet);

    List<Estudiante> findByPeriodoAndJornadaAndGenero(Integer periodo, String jornada, Character genero);

    List<Estudiante> findByPeriodoAndJornadaAndMunicipio(Integer periodo, String jornada, String municipio);

    List<Estudiante> findByPeriodoAndJornadaAndInternet(Integer periodo, String jornada, String internet);

    List<Estudiante> findByPeriodoAndGeneroAndMunicipio(Integer periodo, Character genero, String municipio);

    List<Estudiante> findByPeriodoAndGeneroAndInternet(Integer periodo, Character genero, String internet);

    List<Estudiante> findByPeriodoAndMunicipioAndInternet(Integer periodo, String municipio, String internet);

    List<Estudiante> findByPeriodoAndUbicacionAndBilingueAndCaracter(Integer periodo, String ubicacion, String bilingue, String caracter);

    List<Estudiante> findByPeriodoAndUbicacionAndBilingueAndJornada(Integer periodo, String ubicacion, String bilingue, String jornada);

    List<Estudiante> findByPeriodoAndUbicacionAndBilingueAndGenero(Integer periodo, String ubicacion, String bilingue, Character genero);

    List<Estudiante> findByPeriodoAndUbicacionAndBilingueAndMunicipio(Integer periodo, String ubicacion, String bilingue, String municipio);

    List<Estudiante> findByPeriodoAndUbicacionAndBilingueAndInternet(Integer periodo, String ubicacion, String bilingue, String internet);

    List<Estudiante> findByPeriodoAndUbicacionAndCaracterAndJornada(Integer periodo, String ubicacion, String caracter, String jornada);

    List<Estudiante> findByPeriodoAndUbicacionAndCaracterAndGenero(Integer periodo, String ubicacion, String caracter, Character genero);

    List<Estudiante> findByPeriodoAndUbicacionAndCaracterAndMunicipio(Integer periodo, String ubicacion, String caracter, String municipio);

    List<Estudiante> findByPeriodoAndUbicacionAndCaracterAndInternet(Integer periodo, String ubicacion, String caracter, String internet);

    List<Estudiante> findByPeriodoAndUbicacionAndJornadaAndGenero(Integer periodo, String ubicacion, String jornada, Character genero);

    List<Estudiante> findByPeriodoAndUbicacionAndJornadaAndMunicipio(Integer periodo, String ubicacion, String jornada, String municipio);
    List<Estudiante> findByPeriodoAndUbicacionAndJornadaAndInternet(Integer periodo, String ubicacion, String jornada, String internet);
    List<Estudiante> findByPeriodoAndUbicacionAndGeneroAndMunicipio(Integer periodo, String ubicacion, Character genero, String municipio);

    List<Estudiante> findByPeriodoAndUbicacionAndGeneroAndInternet(Integer periodo, String ubicacion, Character genero, String internet);

    List<Estudiante> findByPeriodoAndUbicacionAndMunicipioAndInternet(Integer periodo, String ubicacion, String municipio, String internet);


    List<Estudiante> findByPeriodoAndColeBilingueAndCaracterAndJornada(Integer periodo, String bilingue, String caracter, String jornada);

    List<Estudiante> findByPeriodoAndColeBilingueAndCaracterAndGenero(Integer periodo, String bilingue, String caracter, Character genero);

    List<Estudiante> findByPeriodoAndColeBilingueAndCaracterAndMunicipio(Integer periodo, String bilingue, String caracter, String muncipio);

    List<Estudiante> findByPeriodoAndColeBilingueAndCaracterAndInternet(Integer periodo, String bilingue, String caracter, String internet);

    List<Estudiante> findByPeriodoAndColeBilingueAndJornadaAndGenero(Integer periodo, String bilingue, String jornada, Character genero);

    List<Estudiante> findByPeriodoAndColeBilingueAndJornadaAndMunicipio(Integer periodo, String bilingue, String jornada, String municipio);

    List<Estudiante> findByPeriodoAndColeBilingueAndGeneroAndMunicipio(Integer periodo, String bilingue, Character genero, String municipio);

    List<Estudiante> findByPeriodoAndColeBilingueAndMunicipioAndInternet(Integer periodo, String bilingue, String municipio, String internet);

    List<Estudiante> findByPeriodoAndColeCaracterAndJornadaAndGenero(Integer periodo, String caracter, String jornada, Character genero);

    List<Estudiante> findByPeriodoAndColeCaracterAndJornadaAndMunicipio(Integer periodo, String caracter, String jornada, String municipio);

    List<Estudiante> findByPeriodoAndColeCaracterAndGeneroAndMunicipio(Integer periodo, String caracter, Character genero, String municipio);

    List<Estudiante> findByPeriodoAndColeCaracterAndGeneroAndInternet(Integer periodo, String caracter, Character genero, String internet);

    List<Estudiante> findByPeriodoAndColeJornadaAndGeneroAndMunicipio(Integer periodo, String jornada, Character genero, String municipio);

    List<Estudiante> findByPeriodoAndColeJornadaAndMunicipioAndInternet(Integer periodo, String jornada, String municipio, String internet);

    List<Estudiante> findByPeriodoAndMunicipioAndGeneroAndInternet(Integer periodo, String municipio, Character genero, String internet);

    List<Estudiante> findByPeriodoAndColeBilingueAndJornadaAndInternet(Integer periodo, String bilingue, String jornada, String internet);

    List<Estudiante> findByPeriodoAndColeBilingueAndGeneroAndInternet(Integer periodo, String bilingue, Character genero, String internet);

    List<Estudiante> findByPeriodoAndColeCaracterAndJornadaAndInternet(Integer periodo, String caracter, String jornada, String internet);

    List<Estudiante> findByPeriodoAndColeCaracterAndMunicipioAndInternet(Integer periodo, String caracter, String municipio, String internet);

    List<Estudiante> findByPeriodoAndColeJornadaAndGeneroAndInternet(Integer periodo, String jornada, Character genero, String internet);
}
