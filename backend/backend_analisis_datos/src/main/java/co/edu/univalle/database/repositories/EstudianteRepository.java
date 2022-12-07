package co.edu.univalle.database.repositories;

import co.edu.univalle.database.entities.Estudiante;
import co.edu.univalle.models.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public interface EstudianteRepository extends MongoRepository<Estudiante, String> {
    @Query(value = "{}", fields = "{ 'COLE_AREA_UBICACION' : 1, '_id' : 0 }")
    HashSet<AreaUbicacion> findAllAreaUbicacion();
    @Query(value = "{}", fields = "{ 'COLE_CARACTER' : 1, '_id' : 0 }")
    HashSet<CaracterColegio> findAllCaracterColegio();
    @Query(value = "{}", fields = "{ 'COLE_JORNADA' : 1, '_id' : 0 }")
    HashSet<JornadaColegio> findAllJornadaColegio();
    @Query(value = "{}", fields = "{ 'ESTU_GENERO' : 1, '_id' : 0 }")
    HashSet<Genero> findAllGenero();
    @Query(value = "{}", fields = "{ 'ESTU_MCPIO_RESIDE' : 1, '_id' : 0 }")
    HashSet<Municipio> findAllMunicipio();
    List<Estudiante> findAll();
    Optional<List<Estudiante>> findByPeriodo(Integer periodo);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacion(Integer periodo, String ubicacion);
    Optional<List<Estudiante>> findByPeriodoAndColeBilingue(Integer periodo, String bilingue);
    Optional<List<Estudiante>> findByPeriodoAndGenero(Integer periodo, Character genero);
    Optional<List<Estudiante>> findByPeriodoAndColeCaracter(Integer periodo, String caracter);
    Optional<List<Estudiante>> findByPeriodoAndColeJornada(Integer periodo, String jornada);
    Optional<List<Estudiante>> findByPeriodoAndMunicipio(Integer periodo, String municipio);
    Optional<List<Estudiante>> findByPeriodoAndAccesoInternet(Integer periodo, String internet);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeBilingue(Integer periodo, String ubicacion, String coleBilingue);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeCaracter(Integer periodo, String ubicacion, String coleCaracter);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeJornada(Integer periodo, String ubicacion, String coleJornada);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndGenero(Integer periodo, String ubicacion, Character genero);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndMunicipio(Integer periodo, String ubicacion, String municipio);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndAccesoInternet(Integer periodo, String ubicacion, String internet);
    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndColeCaracter(Integer periodo, String bilingue, String caracter);
    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndColeJornada(Integer periodo, String bilingue, String jornada);
    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndGenero(Integer periodo, String bilingue, Character genero);
    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndMunicipio(Integer periodo, String bilingue, String muncipio);
    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndAccesoInternet(Integer periodo, String bilingue, String internet);
    Optional<List<Estudiante>> findByPeriodoAndColeCaracterAndColeJornada(Integer periodo, String caracter, String jornada);
    Optional<List<Estudiante>> findByPeriodoAndColeCaracterAndGenero(Integer periodo, String caracter, Character genero);
    Optional<List<Estudiante>> findByPeriodoAndColeCaracterAndMunicipio(Integer periodo, String caracter, String municipio);
    Optional<List<Estudiante>> findByPeriodoAndColeCaracterAndAccesoInternet(Integer periodo, String caracter, String internet);
    Optional<List<Estudiante>> findByPeriodoAndColeJornadaAndGenero(Integer periodo, String jornada, Character genero);
    Optional<List<Estudiante>> findByPeriodoAndColeJornadaAndMunicipio(Integer periodo, String jornada, String municipio);
    Optional<List<Estudiante>> findByPeriodoAndColeJornadaAndAccesoInternet(Integer periodo, String jornada, String internet);
    Optional<List<Estudiante>> findByPeriodoAndGeneroAndMunicipio(Integer periodo, Character genero, String municipio);
    Optional<List<Estudiante>> findByPeriodoAndGeneroAndAccesoInternet(Integer periodo, Character genero, String internet);
    Optional<List<Estudiante>> findByPeriodoAndMunicipioAndAccesoInternet(Integer periodo, String municipio, String internet);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeBilingueAndColeCaracter
            (Integer periodo, String ubicacion, String coleBilingue, String coleCaracter);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeBilingueAndColeJornada
            (Integer periodo, String ubicacion, String coleBilingue, String coleJornada);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeBilingueAndGenero
            (Integer periodo, String ubicacion, String coleBilingue, Character genero);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeBilingueAndMunicipio
            (Integer periodo, String ubicacion, String coleBilingue, String municipio);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeBilingueAndAccesoInternet
            (Integer periodo, String ubicacion, String bilingue, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeCaracterAndColeJornada(Integer periodo, String ubicacion, String caracter, String jornada);

    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeCaracterAndGenero(Integer periodo, String ubicacion, String caracter, Character genero);

    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeCaracterAndMunicipio(Integer periodo, String ubicacion, String caracter, String municipio);

    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeCaracterAndAccesoInternet(Integer periodo, String ubicacion, String caracter, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeJornadaAndGenero(Integer periodo, String ubicacion, String jornada, Character genero);

    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeJornadaAndMunicipio(Integer periodo, String ubicacion, String jornada, String municipio);

    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeJornadaAndAccesoInternet(Integer periodo, String ubicacion, String jornada, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndGeneroAndMunicipio(Integer periodo, String ubicacion, Character genero, String municipio);

    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndGeneroAndAccesoInternet(Integer periodo, String ubicacion, Character genero, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndMunicipioAndAccesoInternet(Integer periodo, String ubicacion, String municipio, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndColeCaracterAndColeJornada(Integer periodo, String bilingue, String caracter, String jornada);

    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndColeCaracterAndGenero(Integer periodo, String bilingue, String caracter, Character genero);

    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndColeCaracterAndMunicipio(Integer periodo, String bilingue, String caracter, String muncipio);

    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndColeCaracterAndAccesoInternet(Integer periodo, String bilingue, String caracter, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndColeJornadaAndGenero(Integer periodo, String bilingue, String jornada, Character genero);

    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndColeJornadaAndMunicipio(Integer periodo, String bilingue, String jornada, String municipio);

    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndGeneroAndMunicipio(Integer periodo, String bilingue, Character genero, String municipio);

    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndMunicipioAndAccesoInternet(Integer periodo, String bilingue, String municipio, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeCaracterAndColeJornadaAndGenero(Integer periodo, String caracter, String jornada, Character genero);

    Optional<List<Estudiante>> findByPeriodoAndColeCaracterAndColeJornadaAndMunicipio(Integer periodo, String caracter, String jornada, String municipio);

    Optional<List<Estudiante>> findByPeriodoAndColeCaracterAndGeneroAndMunicipio(Integer periodo, String caracter, Character genero, String municipio);

    Optional<List<Estudiante>> findByPeriodoAndColeCaracterAndGeneroAndAccesoInternet(Integer periodo, String caracter, Character genero, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeJornadaAndGeneroAndMunicipio(Integer periodo, String jornada, Character genero, String municipio);

    Optional<List<Estudiante>> findByPeriodoAndColeJornadaAndMunicipioAndAccesoInternet(Integer periodo, String jornada, String municipio, String internet);

    Optional<List<Estudiante>> findByPeriodoAndMunicipioAndGeneroAndAccesoInternet(Integer periodo, String municipio, Character genero, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndColeJornadaAndAccesoInternet(Integer periodo, String bilingue, String jornada, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeBilingueAndGeneroAndAccesoInternet(Integer periodo, String bilingue, Character genero, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeCaracterAndColeJornadaAndAccesoInternet(Integer periodo, String caracter, String jornada, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeCaracterAndMunicipioAndAccesoInternet(Integer periodo, String caracter, String municipio, String internet);

    Optional<List<Estudiante>> findByPeriodoAndColeJornadaAndGeneroAndAccesoInternet(Integer periodo, String jornada, Character genero, String internet);

}
