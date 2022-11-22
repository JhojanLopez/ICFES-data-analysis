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
    @Query(value = "{}", fields = "{ 'FAMI_ESTRATOVIVIENDA' : 1, '_id' : 0 }")
    HashSet<Estrato> findAllEstrato();
    List<Estudiante> findAll();
    Optional<List<Estudiante>> findByPeriodo(Integer periodo);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacion(Integer periodo, String ubicacion);
    Optional<List<Estudiante>> findByPeriodoAndGenero(Integer periodo, Character genero);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeBilingue(Integer periodo, String ubicacion, String coleBilingue);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeBilingueAndColeCaracter
            (Integer periodo, String ubicacion, String coleBilingue, String coleCaracter);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeBilingueAndColeCaracterAndColeJornada
            (Integer periodo, String ubicacion, String coleBilingue, String coleCaracter, String coleJornada);
    Optional<List<Estudiante>> findByPeriodoAndColeAreaUbicacionAndColeBilingueAndColeCaracterAndColeJornadaAndGenero
            (Integer periodo, String ubicacion, String coleBilingue, String coleCaracter, String coleJornada, Character genero);
    
}
