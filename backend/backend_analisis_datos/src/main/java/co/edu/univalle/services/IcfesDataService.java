package co.edu.univalle.services;

import co.edu.univalle.database.entities.IcfesData;

import java.util.List;
import java.util.Optional;

public interface IcfesDataService {
    IcfesData findById(String id);
    List<IcfesData> findByPeriodo(Integer periodo);

    List<IcfesData> findByAll();
}
