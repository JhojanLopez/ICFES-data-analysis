package co.edu.univalle.database.repositories;

import co.edu.univalle.database.entities.IcfesData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
public interface IcfesDataRepository extends MongoRepository<IcfesData, String> {
    Optional<List<IcfesData>> findByPeriodo(Integer periodo);
}
