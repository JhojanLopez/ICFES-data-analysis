package co.edu.univalle.database.repositories;

import co.edu.univalle.database.entities.IcfesData;
import co.edu.univalle.models.AreaUbicacion;
import co.edu.univalle.models.Municipios;
import co.edu.univalle.models.TipoColegio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public interface IcfesDataRepository extends MongoRepository<IcfesData, String> {
    Optional<List<IcfesData>> findByPeriodo(Integer periodo);
    @Query(value = "{}", fields = "{ 'ESTU_MCPIO_RESIDE' : 1, '_id' : 0 }")
    HashSet<Municipios> findAllMunicipios();
    @Query(value = "{}", fields = "{ 'COLE_AREA_UBICACION' : 1, '_id' : 0 }")
    HashSet<AreaUbicacion> findAllAreaUbicacion();
    @Query(value = "{}", fields = "{ 'COLE_CARACTER' : 1, '_id' : 0 }")
    HashSet<TipoColegio> findAllTipoColegio();
    @Query(value = "{}", fields = "{ 'COLE_JORNADA' : 1, '_id' : 0 }")
    HashSet<TipoColegio> findAllJornadaColegio();
    @Query(value = "{}", fields = "{ 'FAMI_TIENEINTERNET' : 1, '_id' : 0 }")
    HashSet<TipoColegio> findAllAccesoInternet();

}
